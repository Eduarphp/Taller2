package com.pdm0126.taller2pdm.data.repository
import com.pdm0126.taller2pdm.model.Dish
import com.pdm0126.taller2pdm.model.Restaurant

class RestaurantRepositoryImpl : RestaurantRepository {

    private val restaurants = listOf(

        Restaurant(
            id = 1,
            name = "Pizza Place",
            description = "Las mejores pizzas artesanales",
            imageUrl = "https://images.unsplash.com/photo-1513104890138-7c749659a591",
            categories = listOf("Italiana", "Pizza"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Pizza Margarita",
                    description = "Mozzarella y tomate",
                    imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38"
                ),
                Dish(
                    id = 2,
                    name = "Pizza Pepperoni",
                    description = "Pepperoni y queso",
                    imageUrl = "https://images.unsplash.com/photo-1628840042765-356cda07504e"
                ),
                Dish(
                    id = 3,
                    name = "Pizza Hawaiana",
                    description = "Piña y jamón",
                    imageUrl = "https://images.unsplash.com/photo-1594007654729-407eedc4be65"
                )
            )
        )

    )

    override fun getRestaurants(): List<Restaurant> {
        return restaurants
    }

    override fun getRestaurantById(id: Int): Restaurant? {
        return restaurants.find { it.id == id }
    }
}