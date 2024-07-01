package com.example.mobexam

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.example.mobexam.data.NetWork.PokemonApi
import com.example.mobexam.data.NetWork.PokemonApiServiceImp
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
        val SearchBar: EditText = view.findViewById(R.id.search_bar)
        SearchBar.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {
            }
            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.length != 0)
                {
                    lifecycleScope.launch {
                        RecView.adapter = PokemonsAdapter(serviceImpl.getPokemons().results.filter {it.name.contains(s)})
                    }
                }
                else
                {
                    lifecycleScope.launch {
                        RecView.adapter = PokemonsAdapter(serviceImpl.getPokemons().results)
                    }
                }
            }
        })


        lifecycleScope.launch {
            RecView.adapter = PokemonsAdapter(serviceImpl.getPokemons().results)
        }
    }
}