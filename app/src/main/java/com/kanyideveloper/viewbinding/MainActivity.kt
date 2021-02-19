package com.kanyideveloper.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kanyideveloper.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myButtonn.setOnClickListener {
            Toast.makeText(this@MainActivity, "Button Clicked",Toast.LENGTH_SHORT).show()
        }

        binding.myImageView.setImageResource(R.drawable.ic_launcher_background)

        binding.myTextView.text = "Joel set as text"
    }
}