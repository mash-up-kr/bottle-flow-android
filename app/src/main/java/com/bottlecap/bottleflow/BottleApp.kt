package com.bottlecap.bottleflow

import android.app.Application
import android.content.Context

class BottleApp : Application() {

    override fun onCreate() {
        super.onCreate()
        application = this
    }

    companion object {
        @JvmStatic
        lateinit var application: Application
            private set

        val appContext: Context
            get() = application.applicationContext
    }

}
