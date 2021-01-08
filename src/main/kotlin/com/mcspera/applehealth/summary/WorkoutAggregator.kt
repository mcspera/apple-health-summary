package com.mcspera.applehealth.summary

import com.mcspera.applehealth.summary.model.AggregatedTypedWorkout
import com.mcspera.applehealth.summary.model.Workout
import com.mcspera.applehealth.summary.model.WorkoutType

class WorkoutAggregator {
    fun summarizeByWorkoutType(workouts: List<Workout>): List<AggregatedTypedWorkout> {
        return workouts.groupBy { WorkoutType.forAppleWatchWorkoutType(it.workoutActivityType) }
                .map {
                    it.value.fold(AggregatedTypedWorkout(it.key)) { agg, workout ->
                        agg.addWorkout(workout)
                    }
                }
                .toList()
    }
}