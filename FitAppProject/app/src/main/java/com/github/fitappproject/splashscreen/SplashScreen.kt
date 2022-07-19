package com.github.fitappproject.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.github.fitappproject.presentation.activity.MainActivity

@SuppressLint("CustomSplashScreen")
class SplashScreen: AppCompatActivity() {
    private lateinit var timer : CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        timer = object : CountDownTimer(2000, 1000){
            override fun onTick(p0: Long) {
            }
            override fun onFinish() {
                startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            }
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        timer.cancel()
    }
}