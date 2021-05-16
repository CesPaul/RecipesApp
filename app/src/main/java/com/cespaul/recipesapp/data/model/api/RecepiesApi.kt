package com.cespaul.recipesapp.data.model.api

import retrofit2.http.GET

interface RecepiesApi {

    @GET("/recipes")
    fun getRecipes()

}