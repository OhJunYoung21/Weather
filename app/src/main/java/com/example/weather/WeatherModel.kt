package com.example.weather

import com.google.gson.annotations.SerializedName //서버에서 받아오는 json파일의 값을 넣어줄 클래스

data class WeatherModel(

    @SerializedName("name")
    val name: String,

    @SerializedName("weather")
    var weather: List<WeatherWeatherModel>,

    @SerializedName("main")
    var main: WeatherMainModel,

    @SerializedName("wind")
    var wind: WeatherWindModel,

    @SerializedName("sys")
    var sys: WeatherSysModel,

    @SerializedName("clouds")
    var clouds: WeatherCloudsModel,


    )

data class WeatherWeatherModel(
    @SerializedName("main")
    var main: String?,  //날씨

    @SerializedName("description")
    var description: String?,  //상세 날씨 설명

    @SerializedName("icon")
    var icon: String?,  //날씨 이미지
)

data class WeatherMainModel(
    @SerializedName("temp")
    var temp: Double?,  //현재온도

    @SerializedName("humidity")
    var humidity: Double?,  //현재습도
)


data class WeatherWindModel(
    @SerializedName("speed")
    var speed: Double?,  //풍속
)


data class WeatherSysModel(
    @SerializedName("country")
    var country: String?,  //나라
)


data class WeatherCloudsModel(
    @SerializedName("all")
    var all: Double?,  //구름
)
