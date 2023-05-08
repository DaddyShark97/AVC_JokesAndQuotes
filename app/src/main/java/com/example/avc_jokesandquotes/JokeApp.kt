package com.example.avc_jokesandquotes

import android.app.Application

class JokeApp : Application() {

    lateinit var viewModel: MainViewModel

    override fun onCreate() {
        super.onCreate()

        viewModel = MainViewModel(
            FakeModel(ManageResources.Base(this)))
    }
}