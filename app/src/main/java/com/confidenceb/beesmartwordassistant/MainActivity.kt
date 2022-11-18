package com.confidenceb.beesmartwordassistant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.confidenceb.beesmartwordassistant.databinding.ActivityHomeBinding
import com.confidenceb.beesmartwordassistant.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.button2.setOnClickListener {
        intent = Intent(this@MainActivity,HomeActivity::class.java)
        startActivity(intent)
    }

    }
}