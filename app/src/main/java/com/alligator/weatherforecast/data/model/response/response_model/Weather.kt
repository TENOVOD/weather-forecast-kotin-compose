package com.alligator.weatherforecast.data.model.response.response_model

import kotlinx.serialization.Serializable

@Serializable
data class Weather(

    val main:String,
    val description:String,
    val icon:String,
)