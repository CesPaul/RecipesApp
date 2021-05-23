package com.cespaul.recipes.di.component

import com.cespaul.recipes.di.modules.NetworkModule
import com.cespaul.recipes.di.modules.RepositoryModule
import com.cespaul.recipes.ui.RecipesListViewModel
import dagger.Component
import javax.inject.Scope

@Scope
@Retention
annotation class RecipesScope

@RecipesScope
@Component(
    dependencies = [AppComponent::class],
    modules = [
        NetworkModule::class,
        RepositoryModule::class
    ]
)
interface RecipesComponent {

    fun inject(recipesListViewModel: RecipesListViewModel)

    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): RecipesComponent
    }
}