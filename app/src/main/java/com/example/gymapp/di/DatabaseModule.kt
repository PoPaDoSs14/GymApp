package com.example.gymapp.di

import android.app.Application
import com.example.gymapp.data.AppDatabase
import com.example.gymapp.data.Dao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Application): AppDatabase {
        return AppDatabase.getInstance(application)
    }

    @Provides
    @Singleton
    fun provideDao(database: AppDatabase): Dao {
        return database.dao()
    }
}