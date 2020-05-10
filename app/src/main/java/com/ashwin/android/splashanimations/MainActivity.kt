package com.ashwin.android.splashanimations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToSlideInActivity(v: View) {
        val intent = Intent(this, SlideInActivity::class.java)
        startActivity(intent)
    }

    fun goToCircularProgressBarActivity(v: View) {
        val intent = Intent(this, CircularProgressBarActivity::class.java)
        startActivity(intent)
    }
}
