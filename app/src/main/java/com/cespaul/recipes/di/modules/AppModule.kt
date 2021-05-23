package com.cespaul.recipes.di.modules

import android.content.Context
import com.cespaul.recipes.RecipesApp
import com.cespaul.recipes.di.component.AppScope
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val app: RecipesApp) {

    @AppScope
    @Provides
    fun provideContext(): Context = app.applicationContext

}