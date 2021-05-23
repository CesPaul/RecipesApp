package com.cespaul.recipes.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cespaul.recipes.R

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