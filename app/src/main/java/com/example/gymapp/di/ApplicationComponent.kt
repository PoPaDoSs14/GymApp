package com.example.gymapp.di

import com.example.gymapp.presentation.MainActivity
import dagger.Component

@Component(modules = [])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}