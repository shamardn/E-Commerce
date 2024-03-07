package com.shamardn.e_commerce

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        initSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun initSplashScreen() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.S){
            installSplashScreen()
        }else{
            setTheme(R.style.Theme_MainActivity)
        }
    }
}