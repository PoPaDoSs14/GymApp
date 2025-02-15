package com.example.gymapp.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gymapp.R
import com.example.gymapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}