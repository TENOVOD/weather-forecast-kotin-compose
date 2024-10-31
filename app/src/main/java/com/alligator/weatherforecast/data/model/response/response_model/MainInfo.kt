package com.alligator.weatherforecast.data.model.response.response_model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MainInfo(
    val temp:Float,
    @SerialName("feels_like")
    val feelsLike:Float,

    @SerialName("temp_min")
    val tempMin:Float,
    @SerialName("temp_max")
    val tempMax:Float,

    val humidity:Int,
)