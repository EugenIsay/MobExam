package com.example.mobexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.set
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.example.mobexam.data.NetWork.PokemonApi
import com.example.mobexam.data.NetWork.PokemonApiService
import com.example.mobexam.data.NetWork.PokemonApiServiceImp
import com.example.mobexam.data.Pokemon
import com.example.mobexam.data.PokemonsAdapter
import com.example.mobexam.databinding.FragmentPokedexBinding
import kotlinx.coroutines.launch


class PokedexFragment : Fragment(R.layout.fragment_pokedex) {
    var PokedexFragmentBinding: FragmentPokedexBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        PokedexFragmentBinding = FragmentPokedexBinding.bind(view)
        val service = PokemonApi.retrofitService
        val serviceImpl = PokemonApiServiceImp(service)
        val RecView = view.findViewById<RecyclerView>(R.id.MainRec)
        lifecycleScope.launch {
            RecView.adapter = PokemonsAdapter(serviceImpl.getPokemons().results)
        }
    }
}