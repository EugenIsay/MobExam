package com.example.mobexam.data


data class Pokemons(val results: List<Pokemon>)

data class Pokemon(val name: String, val url:String)
data class TestPokemon(val id: Int, val name: String, val height:String)

data class PokemonStats(val id: Int,val base_stat: Int )

data class PokemonTypes(val id: Int,val name: String )