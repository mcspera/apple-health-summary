package com.mcspera.applehealth.summary

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.mcspera.applehealth.summary.model.HealthData
import java.io.File

class HealthDataReader {

    private val xmlMapper by lazy {
        val xmlModule = JacksonXmlModule()
        xmlModule.setDefaultUseWrapper(false)
        XmlMapper(xmlModule)
    }

    fun readHealthData(path: String): HealthData = xmlMapper.readValue(File(path))
}