package com.example.weather_jc.network

import android.util.Log
import com.example.weather_jc.model.WeatherDataResponse
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class WeatherApiService {

    suspend fun getWeather(): WeatherDataResponse{
        return HttpClientProvider.client.get (
            "https://api.open-meteo.com/v1/forecast?latitude=20.7892&longitude=97.0378&appid=d2c4f3e910bedc360e0c408d8b0174fc&current_weather=true"
        ).body()
//        {
//            parameter("latitude",20.7892 )
//            parameter("longitude", 97.0378)
//            parameter("appid", "d2c4f3e910bedc360e0c408d8b0174fc")
//            parameter("current_weather", true)
//        }.body()

    }

}