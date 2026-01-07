package com.example.weather_jc.screen.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weather_jc.screen.WeatherUiState
import com.example.weather_jc.screen.repo.WeatherRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class WeatherViewModel(
    private val repository: WeatherRepository = WeatherRepository()
): ViewModel() {
    private val _uiState = MutableStateFlow(WeatherUiState())
    val uiState: StateFlow<WeatherUiState> = _uiState

    fun loadWeather(){
        viewModelScope.launch {
            _uiState.value = WeatherUiState(isLoading = true)

            try {
                val response = repository.fetchWeather()
                _uiState.value = WeatherUiState(data = response)
                Log.d("RAW", response.toString())

            } catch (e: Exception){
                Log.e("NETWORK", "Error type: ${e::class.qualifiedName}", e)

                _uiState.value = WeatherUiState(
                    error = e.message ?: "Unknown Error"
                )
            }
        }

    }
}