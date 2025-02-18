package com.example.gymapp.data

import androidx.room.Entity

@Entity("Exercises")
data class ExerciseDbModel (
    val name: String,
    val count: Int
)
