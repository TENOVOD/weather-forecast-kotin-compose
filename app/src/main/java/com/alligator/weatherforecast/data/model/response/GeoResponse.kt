package com.alligator.weatherforecast.data.model.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GeoResponse (
    val name:String,

    @SerialName("lat")
    val latitude:Float,
    @SerialName("lon")
    val longitude:Float
)