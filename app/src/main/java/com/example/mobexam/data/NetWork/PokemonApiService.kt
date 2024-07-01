package com.example.mobexam.data.NetWork
import com.example.mobexam.data.FullPokemon
import com.example.mobexam.data.Pokemon
import com.example.mobexam.data.Pokemons
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HTTP
import retrofit2.http.Path


interface PokemonApiService {

    @GET("pokemon?limit=10")
    suspend fun getPokemons(): Pokemons

    @GET("pokemon/{name}")
    suspend fun getPokemon(name: String): FullPokemon

}