package com.alligator.weatherforecast.data.model.response

import com.alligator.weatherforecast.data.model.response.response_model.MainInfo
import com.alligator.weatherforecast.data.model.response.response_model.Weather
import com.alligator.weatherforecast.data.model.response.response_model.Wind
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastWeatherResponse(

    @SerialName("cod")
    val responseCode:String,

    val list:List<InfoBlock>


){
    @Serializable
    data class InfoBlock(

        @SerialName("dt")
        val date: Long,

        val main: MainInfo,

        val weather: List<Weather> ,

        val wind:Wind,

    )
}