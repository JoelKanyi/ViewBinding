package com.kanyideveloper.viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.kanyideveloper.viewbinding.databinding.FragmentTestBinding

class TestFragment : Fragment(R.layout.fragment_test) {

    private lateinit var binding: FragmentTestBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentTestBinding.bind(view)

        binding.fragButton.setOnClickListener {
            Toast.makeText(requireContext(),"Fragment Button Clicked",Toast.LENGTH_SHORT).show()
        }

        binding.fragImageView.setImageResource(R.drawable.ic_launcher_background)

        binding.frgTextView.text = "Fragment: Text = Joel K"
    }
}