package com.example.gymapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.gymapp.domain.Exercise

@Dao
interface Dao {

    @Insert
    fun addExercise(exerciseDbModel: ExerciseDbModel)

    @Delete
    fun deleteExercise(exercise: Exercise)

    @Query("SELECT * FROM exercises")
    fun getExercises(): List<Exercise>
}