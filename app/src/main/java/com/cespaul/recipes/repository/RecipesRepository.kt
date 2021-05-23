package com.cespaul.recipes.repository

import com.cespaul.recipes.data.model.api.RecipeList
import io.reactivex.Observable

interface RecipesRepository {
    fun loadRecipes(): Observable<ArrayList<RecipeList>>

    fun getRecipesList(): ArrayList<RecipeList>
}