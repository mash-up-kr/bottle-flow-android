package com.bottlecap.bottleflow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        yujeong("dbwjd")
    }
    fun yujeong(a: String) {
        System.out.println(a)
    }
}
