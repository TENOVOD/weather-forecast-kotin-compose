package com.alligator.weatherforecast.data.model.response.response_model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Coordinate(
    @SerialName("lon")
    val longitude:Float,
    @SerialName("lat")
    val latitude:Float
)
