package com.example.avc_jokesandquotes


interface Model <S, E> {

    fun fetch()
    fun clear()
    fun init(resultCallback: ResultCallback<S, E>)
}

interface ResultCallback<S, E> {

    fun provideSuccess(data: S)

    fun provideError(error: E)
}