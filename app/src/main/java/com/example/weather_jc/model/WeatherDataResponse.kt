package com.example.weather_jc.model

import kotlinx.serialization.Serializable

@Serializable
data class WeatherDataResponse(
    val currentWeather: CurrentWeather,
    val currentWeatherUnits: CurrentWeatherUnits,
    val elevation: Double,
    val generationMs: Double,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    val timezoneAbbreviation: String,
    val utcOffsetSeconds: Int
)