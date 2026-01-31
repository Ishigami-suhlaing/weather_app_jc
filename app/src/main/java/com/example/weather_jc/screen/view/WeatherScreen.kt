package com.example.weather_jc.screen.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weather_jc.screen.viewModel.WeatherViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weather_jc.R


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
            IsLoading()

        }

        state.error != null ->{

            ErrorScreen(onRetry = { viewModel.loadWeather() }, state.error!!)

        }

        state.data != null ->{
            Text(text = "API is succeed!")





        }

        else->{
        }
    }
}



//GlassCard(
//modifier = Modifier
//.padding(8.dp)
//.fillMaxWidth()
//) {
//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//
//    ) {
//        Text(state.data!!.latitude.toString())
//        Text(state.data!!.longitude.toString())
//        Text(state.data!!.currentWeather.isDay.toString())
//        Text(state.data!!.currentWeather.temperature.toString())
//        Text(state.data!!.currentWeather.windSpeed.toString())
//
//
//
//    }
//}