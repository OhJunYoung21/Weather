package com.example.weather

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WeatherAPIClient {

    fun getClient(url: String): Retrofit {
        val okHttpClient: OkHttpClient = OkHttpClient.Builder().addInterceptor(Cookiesinterceptor())
            .addNetworkInterceptor(Cookiesinterceptor()).build()

        val retrofit: Retrofit = Retrofit.Builder().baseUrl(url)  //retrofit객체 초기화
            .addConverterFactory(GsonConverterFactory.create())   //gson라이브러리를 통해 JSON파일을 변환시키는 과정
            .client(okHttpClient)
            .build()  //제작

        return retrofit
    }

}