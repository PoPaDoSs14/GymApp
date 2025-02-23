package com.example.gymapp.di

import com.example.gymapp.presentation.MainActivity
import dagger.Component

@Component(modules = [PresentationModule::class, DatabaseModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}