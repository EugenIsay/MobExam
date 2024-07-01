package com.example.mobexam.data.NetWork

import com.example.mobexam.data.Pokemon
import com.example.mobexam.data.Pokemons
import com.example.mobexam.data.TestPokemon

class PokemonApiServiceImp(private  val pokemonApiService: PokemonApiService) {
    suspend fun getPokemons(): Pokemons = pokemonApiService.getPokemons()
    suspend fun getPokemon(id: Int): TestPokemon = pokemonApiService.getPokemon(id)
}