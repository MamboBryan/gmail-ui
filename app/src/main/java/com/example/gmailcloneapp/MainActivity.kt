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

        // TODO: set content view with viewbinding
        setContentView(R.layout.activity_main)

        // TODO: set navigation component

        // TODO: add 5 fragments to the app (1. MailsFragment  2. MailFragment  3. MeetFragment 4.SettingsFragment 5.AuthFragment)

        // TODO: set AuthFragment as start destination
    }
}