package com.example.weather_jc.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherDataResponse(
    @SerialName("current_weather")
    val currentWeather: CurrentWeather,

    @SerialName("current_weather_units")
    val currentWeatherUnits: CurrentWeatherUnits,

    val elevation: Double,

    @SerialName("generationtime_ms")
    val generationMs: Double,

    val latitude: Double,
    val longitude: Double,
    val timezone: String,

    @SerialName("timezone_abbreviation")
    val timezoneAbbreviation: String,

    @SerialName("utc_offset_seconds")
    val utcOffsetSeconds: Int
)