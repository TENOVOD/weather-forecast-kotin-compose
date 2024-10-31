package com.alligator.weatherforecast.domain.repository

import com.alligator.weatherforecast.data.model.response.CurrentWeatherResponse
import com.alligator.weatherforecast.data.model.response.ForecastWeatherResponse
import com.alligator.weatherforecast.data.model.response.GeoResponse

interface OpenWeatherRepository {

    suspend fun getCityCoordinateByName(name:String): GeoResponse

    suspend fun getForecastFor5days(latitude:Float, longitude:Float):ForecastWeatherResponse

    suspend fun getCurrentWeather(latitude:Float, longitude:Float):CurrentWeatherResponse
}