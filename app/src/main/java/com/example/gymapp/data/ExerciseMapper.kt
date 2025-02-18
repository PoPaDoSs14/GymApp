package com.example.gymapp.data

import com.example.gymapp.domain.Exercise

class ExerciseMapper {

    fun mapEntityToDbModel(exercise: Exercise): ExerciseDbModel{
        return ExerciseDbModel(
            id = exercise.id,
            count = exercise.count,
            name = exercise.name
        )
    }

    fun mapDbModelToEntity(exerciseDbModel: ExerciseDbModel): Exercise {
        return Exercise(
            id = exerciseDbModel.id,
            count = exerciseDbModel.count,
            name = exerciseDbModel.name
        )
    }


    fun mapListDbModelToListEntity(list: List<ExerciseDbModel>): List<Exercise> = list.map {
        mapDbModelToEntity(it)!!
    }
}