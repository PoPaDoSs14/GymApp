package com.example.gymapp.domain

interface Repository {

    suspend fun addExercise(exercise: Exercise)

    suspend fun deleteExercise(exercise: Exercise)
}