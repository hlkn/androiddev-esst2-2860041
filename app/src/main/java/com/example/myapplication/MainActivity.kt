package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.let {
            it.setDisplayShowHomeEnabled(true)
            it.setDisplayUseLogoEnabled(true)
            it.setLogo(R.drawable.ic_logo)
        }

        binding.oliveSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                binding.oliveImage.setImageResource(R.drawable.olive_branch)
            else
                binding.oliveImage.setImageResource(R.drawable.ic_olive_branch_vector)
        }
    }
}