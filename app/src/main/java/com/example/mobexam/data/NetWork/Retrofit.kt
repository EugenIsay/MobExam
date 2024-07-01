package com.example.mobexam.data.NetWork

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object PokemonApi {
    private  const val BASE_URL = "https://pokeapi.co/api/v2/"
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
    val retrofitService: PokemonApiService by lazy{
        retrofit.create(PokemonApiService::class.java)
    }
}