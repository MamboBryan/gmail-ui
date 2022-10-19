package com.example.gmailcloneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.gmailcloneapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        replaceFragment(MailFragment())

        val navHostFragment = supportFragmentManager.findFragmentById(binding.navHostFragment.id) as NavHostFragment
        val navController = navHostFragment.navController


        binding.bottomNavigationView.setupWithNavController(navController)

        val destinationChangedListener = NavController.OnDestinationChangedListener { _: NavController?, destination: NavDestination, _: Bundle? ->
                when (destination.id) {
                    R.id.mailsFragment,
                    R.id.meetFragment -> {
                        showBottomNav()
                    }

                    else -> {
                        hideBottomNav()
                    }
                }
            }
        navController.addOnDestinationChangedListener(destinationChangedListener)

    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
   }

    private fun showBottomNav() {
        // find the bottom nav view with binding and set visibility to true
        binding.bottomNavigationView.isVisible = true

    }

    private fun hideBottomNav(){
        // find the bottom nav view with binding and set visibility to false
        binding.bottomNavigationView.isVisible = false
    }

}