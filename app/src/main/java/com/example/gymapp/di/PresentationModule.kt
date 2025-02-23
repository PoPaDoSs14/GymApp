package com.example.gymapp.di

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class PresentationModule {

    @Provides
    fun provideRegistrationViewModel(): Application{
        return Application()
    }

}