package com.pdm0126.taller2pdm.data.repository
import com.pdm0126.taller2pdm.model.Restaurant


interface RestaurantRepository {

    fun getRestaurants(): List<Restaurant>

    fun getRestaurantById(id: Int): Restaurant?

}