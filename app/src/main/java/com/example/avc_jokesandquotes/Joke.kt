package com.example.avc_jokesandquotes

class Joke(private val text: String, private val punchline: String) {

    fun toUi() = "$text\n$punchline"
}