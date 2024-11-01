package com.alligator.weatherforecast

import com.alligator.weatherforecast.data.model.response.ForecastWeatherResponse
import com.alligator.weatherforecast.data.model.response.GeoResponse
import com.alligator.weatherforecast.data.model.response.response_model.Coordinate
import com.alligator.weatherforecast.data.repository.OpenWeatherRepositoryImpl
import com.alligator.weatherforecast.di.ClientServerModule
import com.alligator.weatherforecast.domain.repository.OpenWeatherRepository
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun get_coordinate_by_name(){
        val client = ClientServerModule.provideHttpClient()
        val repo:OpenWeatherRepository = OpenWeatherRepositoryImpl(client)
        val cityName = "Odesa"

        val  expected = GeoResponse("Odesa", latitude = 46.484303f, longitude = 30.732288f)
       runBlocking {
           val actual = repo.getCityCoordinateByName(cityName).get(0)
           assertEquals(expected,actual)
       }
    }

    @Test
    fun get_forecast_for_5_days(){
        val client = ClientServerModule.provideHttpClient()
        val repo:OpenWeatherRepository = OpenWeatherRepositoryImpl(client)

        val lat = 46.4843023
        val lon = 30.7322878
        runBlocking {
            val actual = repo.getForecastFor5days(latitude = lat, longitude = lon).responseCode
            val expected = ForecastWeatherResponse("200", list = emptyList()).responseCode

            assertEquals(expected,actual)
        }

    }

    @Test
    fun get_current_weather(){
        val client = ClientServerModule.provideHttpClient()
        val repo:OpenWeatherRepository = OpenWeatherRepositoryImpl(client)

        val lat = 46.4843
        val lon = 30.7323
        runBlocking {
            val actual = repo.getCurrentWeather(latitude = lat, longitude = lon).coordinate
            val expected = Coordinate(latitude = lat, longitude = lon)

            assertEquals(expected,actual)
        }
    }

}