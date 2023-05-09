package com.example.avc_jokesandquotes

import retrofit2.Call
import retrofit2.http.GET


interface JokeService {
    @GET("random_joke")

    fun joke() : Call<JokeCloud>

}