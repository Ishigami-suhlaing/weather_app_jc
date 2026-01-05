package com.example.weather_jc.screen.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.weather_jc.screen.viewModel.WeatherViewModel

@Composable
fun WeatherScreen(
    viewModel: WeatherViewModel = WeatherViewModel(),


    ) {
    val state by viewModel.uiState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadWeather()
    }

    when{
        state.isLoading ->{
            Text("Loading")
        }

        state.error != null ->{
            Text("Error: ${state.error}")
        }

        state.data != null ->{
            Column(

            ) {
                Text("Hellow")
            }
        }
    }
}