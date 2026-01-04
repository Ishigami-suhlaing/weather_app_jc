package com.example.weather_jc.model

import kotlinx.serialization.Serializable

@Serializable
data class CurrentWeather(
    val interval: Int,
    val isDay: Int,
    val temperature: Double,
    val time: String,
    val weatherCode: Int,
    val windDirection: Int,
    val windSpeed: Double
)