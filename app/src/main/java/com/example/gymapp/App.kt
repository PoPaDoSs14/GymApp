package com.example.gymapp

import android.app.Application

class App: Application() {

    val component by lazy {
        DaggerApplicationComponent
            .factory()
            .create()
    }

}