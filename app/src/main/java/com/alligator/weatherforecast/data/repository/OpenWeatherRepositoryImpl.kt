package com.alligator.weatherforecast.data.repository

import androidx.core.os.BuildCompat
import com.alligator.weatherforecast.BuildConfig
import com.alligator.weatherforecast.data.model.response.CurrentWeatherResponse
import com.alligator.weatherforecast.data.model.response.ForecastWeatherResponse
import com.alligator.weatherforecast.data.model.response.GeoResponse
import com.alligator.weatherforecast.domain.repository.OpenWeatherRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import javax.inject.Inject

class OpenWeatherRepositoryImpl @Inject constructor(
    private val client: HttpClient
) : OpenWeatherRepository {

    private val BASE_URL = "http://api.openweathermap.org"

    override suspend fun getCityCoordinateByName(name: String): List<GeoResponse> {

        val url = "$BASE_URL/geo/1.0/direct?q=$name&appid=${BuildConfig.GEO_API_KEY}"

        return client.get(url).body()
    }

    override suspend fun getForecastFor5days(
        latitude: Double,
        longitude: Double
    ):  ForecastWeatherResponse{

        val url = "$BASE_URL/data/2.5/forecast?lat=$latitude&lon=$longitude&appid=${BuildConfig.GEO_API_KEY}&units=metric"

        return client.get(url).body()
    }

    override suspend fun getCurrentWeather(
        latitude: Double,
        longitude: Double
    ):  CurrentWeatherResponse {
        val url = "$BASE_URL/data/2.5/weather?lat=$latitude&lon=$longitude&appid=${BuildConfig.GEO_API_KEY}&units=metric"
        return client.get(url).body()
    }
}