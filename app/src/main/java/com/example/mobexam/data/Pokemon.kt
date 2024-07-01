package com.example.mobexam.data


data class Pokemons(val results: List<Pokemon>)

data class Pokemon(val name: String, val url:String)

data class FullPokemon(val id: Int, val name: String, val types: Types, val weight: Int, val height: Int, val stats: Stats)



data class Stats(val base_stat: Int )

data class Types(val name: String )