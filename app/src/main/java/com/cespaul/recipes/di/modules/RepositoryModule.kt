package com.cespaul.recipes.di.modules

import com.cespaul.recipes.data.model.api.RecipesApi
import com.cespaul.recipes.di.component.RecipesScope
import com.cespaul.recipes.repository.RecipesRepository
import com.cespaul.recipes.repository.RecipesRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @RecipesScope
    @Provides
    fun provideRecipesRepository(recipesApi: RecipesApi): RecipesRepository =
        RecipesRepositoryImpl(recipesApi)
}