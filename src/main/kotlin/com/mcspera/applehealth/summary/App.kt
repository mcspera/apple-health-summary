/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.mcspera.applehealth.summary

fun main(args: Array<String>) {
    val healthDataExportFile = args[0]
    val summarizer = Summarizer(healthDataExportFile)
    summarizer.printSummary()
}
