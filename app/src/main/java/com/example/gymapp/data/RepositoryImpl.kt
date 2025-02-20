package com.example.gymapp.data

import android.app.Application
import com.example.gymapp.domain.Exercise
import com.example.gymapp.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val application: Application,
    private val mapper: ExerciseMapper,
    private val dao: Dao
) : Repository {

    override suspend fun addExercise(exercise: Exercise) {
        dao.addExercise(mapper.mapEntityToDbModel(exercise))
    }

    override suspend fun deleteExercise(exercise: Exercise) {
        dao.deleteExercise(mapper.mapEntityToDbModel(exercise))
    }

    override suspend fun getExercises(): List<Exercise> {
        return mapper.mapListDbModelToListEntity(dao.getExercises())
    }

}