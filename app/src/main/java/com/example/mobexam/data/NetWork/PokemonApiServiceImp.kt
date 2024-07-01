package com.example.mobexam.data.NetWork

import com.example.mobexam.data.Pokemon
import com.example.mobexam.data.Pokemons

class PokemonApiServiceImp(private  val pokemonApiService: PokemonApiService) {
    suspend fun getPokemons(): Pokemons = pokemonApiService.getPokemons()
}