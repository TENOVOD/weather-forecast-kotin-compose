package com.alligator.weatherforecast.data.repository

import com.alligator.weatherforecast.data.model.response.CurrentWeatherResponse
import com.alligator.weatherforecast.data.model.response.ForecastWeatherResponse
import com.alligator.weatherforecast.data.model.response.GeoResponse
import com.alligator.weatherforecast.domain.repository.OpenWeatherRepository
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import javax.inject.Inject

class OpenWeatherRepositoryImpl @Inject constructor(
    private val client: HttpClient
) :OpenWeatherRepository {

    private val BASE_URL = "http://api.openweathermap.org"

    override suspend fun getCityCoordinateByName(name: String): GeoResponse {
        TODO("Not yet implemented")
    //return  client.get("$BASE_URL/geo/1.0/direct?q=$name&appid = ")
    }

    override suspend fun getForecastFor5days(
        latitude: Float,
        longitude: Float
    ): ForecastWeatherResponse {
        TODO("Not yet implemented")
    }

    override suspend fun getCurrentWeather(
        latitude: Float,
        longitude: Float
    ): CurrentWeatherResponse {
        TODO("Not yet implemented")
    }
}