package com.example.weather_jc.screen

import com.example.weather_jc.model.WeatherDataResponse

data class WeatherUiState (
    val isLoading: Boolean = false,
    val data: WeatherDataResponse? = null,
    val error: String? = null
)