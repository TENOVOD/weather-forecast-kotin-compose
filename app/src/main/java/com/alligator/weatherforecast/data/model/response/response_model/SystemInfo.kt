package com.alligator.weatherforecast.data.model.response.response_model

import kotlinx.serialization.Serializable

@Serializable
data class SystemInfo(
    val sunrise:Long,
    val sunset:Long
)
