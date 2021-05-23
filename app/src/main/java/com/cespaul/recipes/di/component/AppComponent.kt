package com.cespaul.recipes.di.component

import android.content.Context
import com.cespaul.recipes.RecipesApp
import com.cespaul.recipes.di.modules.AppModule
import dagger.Component
import javax.inject.Scope

@Scope
@Retention
annotation class AppScope

@AppScope
@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {

    fun inject(app: RecipesApp)

    fun appContext(): Context

    @Component.Factory
    interface Factory {
        fun create(appModule: AppModule): AppComponent
    }
}