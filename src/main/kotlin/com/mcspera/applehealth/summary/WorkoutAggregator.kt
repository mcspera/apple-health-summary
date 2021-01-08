package com.mcspera.applehealth.summary

import com.mcspera.applehealth.summary.model.AggregatedTypedWorkout
import com.mcspera.applehealth.summary.model.Workout

class WorkoutAggregator {
    fun summarizeByWorkoutType(workouts: List<Workout>): List<AggregatedTypedWorkout> {
        return workouts.groupBy { it.workoutActivityType }
                .map {
                    it.value.fold(AggregatedTypedWorkout(it.key)) { agg, workout ->
                        agg.addWorkout(workout)
                    }
                }
                .toList()
    }
}