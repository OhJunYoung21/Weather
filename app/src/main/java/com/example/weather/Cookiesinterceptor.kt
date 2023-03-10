package com.example.weather

import okhttp3.Interceptor
import okhttp3.Response

class Cookiesinterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request =
            chain.request().newBuilder().header("Content-Type", "application/json").build()
        return chain.proceed(request)  //발신자가 수신자에게 파일이 JSON형식으로 보내짐을 알려준다.
    }
}