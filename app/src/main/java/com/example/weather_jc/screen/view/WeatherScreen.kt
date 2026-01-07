package com.example.weather_jc.screen.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.weather_jc.screen.viewModel.WeatherViewModel
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun WeatherScreen(
    modifier: Modifier = Modifier,
    viewModel: WeatherViewModel = viewModel(),


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
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(state.data!!.latitude.toString())
                Text(state.data!!.longitude.toString())
                Text(state.data!!.currentWeather.isDay.toString())
                Text(state.data!!.currentWeather.temperature.toString())
                Text(state.data!!.currentWeather.windSpeed.toString())
            }
        }

        else->{
            Text("Well, I don't know why")
        }
    }
}