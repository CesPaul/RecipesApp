package com.cespaul.recipes.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cespaul.recipes.data.model.api.RecipeList
import com.cespaul.recipes.data.model.api.RecipesApi
import com.cespaul.recipes.repository.RecipesRepository
import io.reactivex.disposables.Disposable
import javax.inject.Inject

class RecipesListViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    @Inject
    lateinit var recipeApi: RecipesApi

    @Inject
    lateinit var repository: RecipesRepository

    val recipesList = MutableLiveData<ArrayList<RecipeList>>()

    fun getRecipesList(): Disposable {
        return repository
            .loadRecipes()
            .subscribe {
                recipesList.value = it
            }
    }
}