package com.example.simpleretrofitapp.Interface

import com.example.simpleretrofitapp.Model.Movie
import retrofit2.Call
import retrofit2.http.*

interface RetrofitServices {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<Movie>>
}