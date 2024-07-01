package com.example.mobexam.data.NetWork
import com.example.mobexam.data.Pokemon
import com.example.mobexam.data.Pokemons
import com.example.mobexam.data.TestPokemon
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HTTP
import retrofit2.http.Path


interface PokemonApiService {

    @GET("pokemon?limit=9")
    suspend fun getPokemons(): Pokemons

    @GET("pokemon/{id}")
    suspend fun getPokemon(@Path(value = "id")key: Int): TestPokemon
}