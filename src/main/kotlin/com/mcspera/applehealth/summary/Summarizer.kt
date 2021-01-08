package com.mcspera.applehealth.summary

class Summarizer constructor(val path: String, val prefix: String = "2020") {
    val healthDataReader = HealthDataReader()
    val workoutAggregator = WorkoutAggregator()
    val activityAggregator = ActivityAggregator()
    val healthData by lazy {
        healthDataReader.readHealthData(path)
    }

    fun printSummary() {
        println("workout summary:")
        workoutAggregator.summarizeByWorkoutType(healthData.workouts.filter { it.startDate.startsWith(prefix) })
                .forEach { println(it) }
    }
}