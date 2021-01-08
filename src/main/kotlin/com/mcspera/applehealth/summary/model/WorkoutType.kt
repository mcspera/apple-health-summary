package com.mcspera.applehealth.summary.model

enum class WorkoutType constructor(val appleWatchWorkoutType: String) {
    Weights("HKWorkoutActivityTypeOther"),
    Cycling("HKWorkoutActivityTypeCycling"),
    Walking("HKWorkoutActivityTypeWalking"),
    Running("HKWorkoutActivityTypeRunning"),
    Hiking("HKWorkoutActivityTypeHiking"),
    Unknown("");


    companion object {
        fun forAppleWatchWorkoutType(appleWatchWorkoutType: String): WorkoutType =
                values().firstOrNull { it.appleWatchWorkoutType == appleWatchWorkoutType } ?: Unknown

    }
}