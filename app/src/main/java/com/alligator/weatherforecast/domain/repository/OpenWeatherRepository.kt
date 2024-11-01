package com.alligator.weatherforecast.domain.repository

import com.alligator.weatherforecast.data.model.response.CurrentWeatherResponse
import com.alligator.weatherforecast.data.model.response.ForecastWeatherResponse
import com.alligator.weatherforecast.data.model.response.GeoResponse

interface OpenWeatherRepository {

    suspend fun getCityCoordinateByName(name:String): List<GeoResponse>

    suspend fun getForecastFor5days(latitude:Double, longitude:Double): ForecastWeatherResponse

    suspend fun getCurrentWeather(latitude:Double, longitude:Double): CurrentWeatherResponse
}