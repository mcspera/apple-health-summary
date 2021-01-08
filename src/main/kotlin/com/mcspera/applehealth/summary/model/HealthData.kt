package com.mcspera.applehealth.summary.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "HealthData")
data class HealthData(
        @JacksonXmlElementWrapper(useWrapping = false) @JacksonXmlProperty(localName = "Workout") val workouts: List<Workout>,
        @JacksonXmlElementWrapper(useWrapping = false) @JacksonXmlProperty(localName = "ActivitySummary") val activities: List<ActivitySummary>
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ActivitySummary(
        @JacksonXmlProperty(isAttribute = true, localName = "dateComponents") val dateComponents: String,
        @JacksonXmlProperty(isAttribute = true, localName = "activeEnergyBurned") val activeEnergyBurned: Float,
        @JacksonXmlProperty(isAttribute = true, localName = "activeEnergyBurnedGoal") val activeEnergyBurnedGoal: Float,
        @JacksonXmlProperty(isAttribute = true, localName = "appleExerciseTime") val appleExerciseTime: Float,
        @JacksonXmlProperty(isAttribute = true, localName = "appleExerciseTimeGoal") val appleExerciseTimeGoal: Float,
        @JacksonXmlProperty(isAttribute = true, localName = "appleStandHours") val appleStandHours: Float,
        @JacksonXmlProperty(isAttribute = true, localName = "appleStandHoursGoal") val appleStandHoursGoal: Float
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Workout(
        @JacksonXmlProperty(isAttribute = true, localName = "workoutActivityType") val workoutActivityType: String,
        @JacksonXmlProperty(isAttribute = true, localName = "duration") val duration: Float,
        @JacksonXmlProperty(isAttribute = true, localName = "totalDistance") val totalDistance: Float,
        @JacksonXmlProperty(isAttribute = true, localName = "totalEnergyBurned") val totalEnergyBurned: Float,
        @JacksonXmlProperty(isAttribute = true, localName = "creationDate") val creationDate: String,
        @JacksonXmlProperty(isAttribute = true, localName = "startDate") val startDate: String,
        @JacksonXmlProperty(isAttribute = true, localName = "endDate") val endDate: String
)
