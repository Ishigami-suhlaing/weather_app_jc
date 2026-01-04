package com.example.weather_jc.model

import kotlinx.serialization.Serializable

@Serializable
data class CurrentWeatherUnits(
    val interval: String,
    val isDay: String,
    val temperature: String,
    val time: String,
    val weatherCode: String,
    val windDirection: String,
    val windSpeed: String
)