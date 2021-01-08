package com.mcspera.applehealth.summary.model

class AggregatedTypedWorkout constructor(val type: String) {
    var counts: Int = 0
    var duration: Double = 0.0
    var totalDistance: Double = 0.0
    var energyBurned: Double = 0.0

    fun addWorkout(workout: Workout): AggregatedTypedWorkout {
        counts++
        duration += workout.duration
        totalDistance += workout.totalDistance
        energyBurned += workout.totalEnergyBurned

        return this
    }

    override fun toString(): String {
        return "AggregatedWorkoutData(type='$type', counts=$counts, duration=$duration, totalDistance=$totalDistance, energyBurned=$energyBurned)"
    }
}