package com.alligator.weatherforecast.data.model.response

import com.alligator.weatherforecast.data.model.response.response_model.Coordinate
import com.alligator.weatherforecast.data.model.response.response_model.MainInfo
import com.alligator.weatherforecast.data.model.response.response_model.SystemInfo
import com.alligator.weatherforecast.data.model.response.response_model.Weather
import com.alligator.weatherforecast.data.model.response.response_model.Wind
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrentWeatherResponse(

    @SerialName("coord")
    val coordinate: Coordinate,

    val weather: Weather,

    val main: MainInfo,

    val wind: Wind,

    @SerialName("sys")
    val systemInfo: SystemInfo


)