package com.example.gymapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("Exercises")
data class ExerciseDbModel (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val count: Int
)
