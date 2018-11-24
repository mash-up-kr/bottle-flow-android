package com.bottlecap.bottleflow

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setAnimation()
    }

    private fun setAnimation(){
        startAnimation(mainBottle1, R.anim.bottle1)
        startAnimation(mainBottle2, R.anim.bottle2)
        startAnimation(mainBottle3, R.anim.bottle2)
        startAnimation(mainBottle4, R.anim.bottle2)
        startAnimation(mainBottle5, R.anim.bottle2)
        startAnimation(mainBottle6, R.anim.bottle2)
        startAnimation(mainSun, R.anim.sun)
        startAnimation(mainCloud1, R.anim.cloud1)
        startAnimation(mainCloud2, R.anim.cloud2)
    }

    private fun startAnimation(imageView: ImageView, animationId: Int) {
        imageView.startAnimation(AnimationUtils.loadAnimation(this, animationId))
    }
}
