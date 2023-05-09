package com.example.avc_jokesandquotes

import android.app.Application
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class JokeApp : Application() {

    lateinit var viewModel: MainViewModel

    override fun onCreate() {
        super.onCreate()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://official-joke-api.appspot.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        viewModel = MainViewModel(
            BaseModel(
                retrofit.create(JokeService::class.java),
                ManageResources.Base(this)
            )
        )
    }
}