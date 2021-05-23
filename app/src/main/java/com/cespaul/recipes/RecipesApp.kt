package com.cespaul.recipes

import android.app.Application
import android.content.Context
import com.cespaul.recipes.di.component.AppComponent
import com.cespaul.recipes.di.component.DaggerAppComponent
import com.cespaul.recipes.di.modules.AppModule
import com.facebook.drawee.backends.pipeline.Fresco

class RecipesApp : Application() {

    companion object {
        lateinit var instance: RecipesApp
            private set

        lateinit var appComponent: AppComponent private set
        val appContext: Context
            get() = instance.applicationContext
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        appComponent = DaggerAppComponent
            .factory()
            .create(AppModule(this))
        appComponent.inject(this)

        Fresco.initialize(instance)
    }
}