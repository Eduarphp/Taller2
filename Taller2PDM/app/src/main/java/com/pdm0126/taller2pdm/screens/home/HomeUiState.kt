package com.pdm0126.taller2pdm.screens.home
import com.pdm0126.taller2pdm.model.Restaurant

data class HomeUiState(

    val groupedRestaurants: Map<String, List<Restaurant>> = emptyMap()

)