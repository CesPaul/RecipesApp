package com.cespaul.recipes.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cespaul.recipes.R
import com.cespaul.recipes.ui.fragments.RecipesListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager.beginTransaction()

        val recipesListFragment = RecipesListFragment.newInstance()
        fm.add(android.R.id.content, recipesListFragment).commit()
    }
}