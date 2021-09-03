package com.example.simpleretrofitapp.Common

import com.example.simpleretrofitapp.Interface.RetrofitServices
import com.example.simpleretrofitapp.Retrofit.RetrofitClient

object Common {
    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}