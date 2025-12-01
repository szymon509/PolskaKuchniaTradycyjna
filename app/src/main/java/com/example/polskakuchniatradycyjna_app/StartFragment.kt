package com.example.polskakuchniatradycyjna_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.polskakuchniatradycyjna_app.databinding.StartFragmentBinding

class MainActivity: AppCompatActivity() {
    private lateinit var binding: StartFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = StartFragmentBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)
        setContentView(R.layout.start_fragment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}