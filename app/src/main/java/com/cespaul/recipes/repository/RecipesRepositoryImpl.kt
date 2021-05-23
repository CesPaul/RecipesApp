package com.cespaul.recipes.repository

import com.cespaul.recipes.data.model.api.RecipeList
import com.cespaul.recipes.data.model.api.RecipesApi
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RecipesRepositoryImpl(private val recipesApi: RecipesApi) : RecipesRepository {

    private var recipesList: ArrayList<RecipeList> = arrayListOf()

    override fun loadRecipes(): Observable<ArrayList<RecipeList>> {
        return recipesApi.getRecipes()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
    }

    override fun getRecipesList(): ArrayList<RecipeList> {
        return recipesList
    }

}