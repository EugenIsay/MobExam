package com.example.mobexam

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobexam.databinding.ActivityMainBinding
import androidx.activity.enableEdgeToEdge
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.mobexam.R


class MainActivity : AppCompatActivity() {
    var MainActivityBinding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = MainActivityBinding?.root
        setContentView(view)
        supportFragmentManager.commit {
            add<PokedexFragment>(R.id.MainActivity)
        }
    }
}