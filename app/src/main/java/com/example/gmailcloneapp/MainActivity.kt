package com.example.gmailcloneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gmailcloneapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root


        setContentView(R.layout.activity_main)
    }
}