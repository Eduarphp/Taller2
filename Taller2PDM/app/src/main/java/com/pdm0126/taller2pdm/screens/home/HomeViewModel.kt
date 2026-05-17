package com.pdm0126.taller2pdm.screens.home
import androidx.lifecycle.ViewModel
import com.pdm0126.taller2pdm.data.repository.RestaurantRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {

    private val repository = RestaurantRepositoryImpl()

    private val _uiState = MutableStateFlow(HomeUiState())

    val uiState = _uiState.asStateFlow()

    init {

        val restaurants = repository.getRestaurants()

        val grouped = restaurants
            .flatMap { restaurant ->

                restaurant.categories.map { category ->

                    category to restaurant
                }
            }
            .groupBy(
                keySelector = { it.first },
                valueTransform = { it.second }
            )

        _uiState.value = HomeUiState(
            groupedRestaurants = grouped
        )
    }
}