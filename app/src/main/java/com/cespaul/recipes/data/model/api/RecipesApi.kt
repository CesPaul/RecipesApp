package com.cespaul.recipes.data.model.api

import io.reactivex.Observable
import retrofit2.http.GET

interface RecipesApi {

    @GET("/recipes")
    fun getRecipes(): Observable<ArrayList<RecipeList>>

}