package com.example.gymapp.data

import android.app.Application
import com.example.gymapp.domain.Exercise
import com.example.gymapp.domain.Repository

class RepositoryImpl(
    private val application: Application,
    private val mapper: ExerciseMapper
) : Repository {

    override suspend fun addExercise(exercise: Exercise) {
        AppDatabase.getInstance(application).Dao()
            .addExercise(mapper.mapEntityToDbModel(exercise))
    }

}