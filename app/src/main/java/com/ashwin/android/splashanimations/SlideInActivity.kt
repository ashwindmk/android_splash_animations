package com.ashwin.android.splashanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_slidein.*

class SlideInActivity : AppCompatActivity() {
    var slideInTopAnim: Animation? = null
    var slideInBottomAnim: Animation? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slidein)

        slideInTopAnim = AnimationUtils.loadAnimation(this, R.anim.slide_in_top)
        slideInBottomAnim = AnimationUtils.loadAnimation(this, R.anim.slide_in_bottom)

        logo_imageview.animation = slideInTopAnim
        name_textview.animation = slideInBottomAnim
        tag_textview.animation = slideInBottomAnim
    }

    override fun onStart() {
        super.onStart()

        Handler().postDelayed(Runnable {
            Log.d("splash-demo", "splash: finish")
            finish()
        }, 5000)
    }
}
