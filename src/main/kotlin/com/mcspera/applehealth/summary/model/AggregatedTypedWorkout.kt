package com.mcspera.applehealth.summary.model

class AggregatedTypedWorkout constructor(val type: WorkoutType) {
    var count: Int = 0
    var duration: Double = 0.0
    var totalDistance: Double = 0.0
    var energyBurned: Double = 0.0

    fun addWorkout(workout: Workout): AggregatedTypedWorkout {
        count++
        duration += workout.duration
        totalDistance += workout.totalDistance
        energyBurned += workout.totalEnergyBurned

        return this
    }

    override fun toString(): String {
        return "AggregatedWorkoutData(type=$type, count=$count, duration=$duration, totalDistance=$totalDistance, energyBurned=$energyBurned)"
    }
}