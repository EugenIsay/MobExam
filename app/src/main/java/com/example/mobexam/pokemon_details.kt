package com.example.mobexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobexam.databinding.FragmentPokemonDetailsBinding


class pokemon_details : Fragment() {
    var PokemonDetailsBinding: FragmentPokemonDetailsBinding? = null;
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        PokemonDetailsBinding = FragmentPokemonDetailsBinding.bind(view)
    }


}