package com.cespaul.recipesapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cespaul.recipesapp.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onResume() {
        super.onResume()

        val mainIntent = Intent(applicationContext, MainActivity::class.java)
        startActivity(mainIntent)
        finish()
    }
}