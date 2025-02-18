package com.example.gymapp.data

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface Dao {

    @Insert
    fun addExercise(exerciseDbModel: ExerciseDbModel)
}