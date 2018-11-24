package com.bottlecap.bottleflow

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setAnimation()
    }

    fun setAnimation(){
        var bottle1: Animation = AnimationUtils.loadAnimation (this, R.anim.bottle1)
        var bottle2: Animation = AnimationUtils.loadAnimation (this, R.anim.bottle2)
        var bottle3: Animation = AnimationUtils.loadAnimation (this, R.anim.bottle3)
        var sun: Animation = AnimationUtils.loadAnimation (this, R.anim.sun)
        var cloud1: Animation = AnimationUtils.loadAnimation (this, R.anim.cloud1)
        var cloud2: Animation = AnimationUtils.loadAnimation (this, R.anim.cloud2)
        mainBottle1.startAnimation(bottle1)
        mainBottle2.startAnimation(bottle1)
        mainBottle3.startAnimation(bottle2)
        mainBottle4.startAnimation(bottle2)
        mainBottle5.startAnimation(bottle3)
        mainBottle6.startAnimation(bottle3)
        mainSun.startAnimation(sun)
        mainCloud1.startAnimation(cloud1)
        mainCloud2.startAnimation(cloud2)
    }
}
