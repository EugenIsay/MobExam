package com.example.mobexam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobexam.databinding.FragmentPokedexBinding


class PokedexFragment : Fragment() {
    var PokedexFragmentBinding: FragmentPokedexBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        PokedexFragmentBinding = FragmentPokedexBinding.bind(view)
    }
}