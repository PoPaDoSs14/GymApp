package com.example.gymapp.di

import com.example.gymapp.presentation.MainActivity
import dagger.Component

@Component(modules = [PresentationModule::class, DatabaseModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)


    @Component.Factory
    interface ApplicationComponentFactory {
        /**
         * Создает экземпляр ApplicationComponent.
         * Параметры можно добавить здесь, если требуется передавать зависимости.
         */
        fun create(): ApplicationComponent
    }
}