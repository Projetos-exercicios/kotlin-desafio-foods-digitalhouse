package com.example.digitalhousefoods.model.restaurants


import com.example.digitalhousefoods.model.Restaurants

class RestaurantsBusiness {

    private val repository:RestaurantsRepository by lazy {
        RestaurantsRepository()
    }
    fun getRestaurants(): Restaurants {
        return repository.getRestaurants()
    }
}