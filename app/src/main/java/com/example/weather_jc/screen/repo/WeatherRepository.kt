package com.example.weather_jc.screen.repo

import com.example.weather_jc.model.WeatherDataResponse
import com.example.weather_jc.network.WeatherApiService

class WeatherRepository(
    private val api: WeatherApiService = WeatherApiService()

) {

    suspend fun fetchWeather(): WeatherDataResponse{
        return api.getWeather()
    }

}