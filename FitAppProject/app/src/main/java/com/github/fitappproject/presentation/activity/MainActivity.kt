package com.github.fitappproject.presentation.activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.fitappproject.databinding.ActivityMainBinding
import com.github.fitappproject.presentation.fragments.FragmentManager
import com.github.fitappproject.presentation.fragments.OneFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fragmentManager = FragmentManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragmentManager.nextFragment(activity = this, newFragment = OneFragment.newInstance())
    }
}