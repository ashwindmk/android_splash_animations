package com.ashwin.android.splashanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

class CircularProgressBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circular_progressbar)
    }

    override fun onStart() {
        super.onStart()
        Handler().postDelayed(Runnable {
            Log.d("splash-demo", "splash: finish")
            finish()
        }, 5000)
    }
}
