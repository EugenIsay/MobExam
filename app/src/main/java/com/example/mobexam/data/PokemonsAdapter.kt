package com.example.mobexam.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobexam.R
import com.example.mobexam.data.NetWork.PokemonApi
import com.example.mobexam.data.NetWork.PokemonApiServiceImp

class PokemonsAdapter( private val Pokemons: List<Pokemon>) :
    RecyclerView.Adapter<PokemonsAdapter.ViewHolder>()
{
    val service = PokemonApi.retrofitService
    val serviceImpl = PokemonApiServiceImp(service)
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val CardName: TextView = itemView.findViewById(R.id.CardName)
        val CardId: TextView =  itemView.findViewById(R.id.CardId)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.pokemon_card, parent, false)
        return ViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return Pokemons.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.CardName.text = Pokemons[position].name
    }


}