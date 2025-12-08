package com.example.polskakuchniatradycyjna_app

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.fragment.app.Fragment
import com.example.polskakuchniatradycyjna_app.databinding.StartFragmentBinding


class StartFragment : Fragment(R.layout.start_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = StartFragmentBinding.bind(view)

        binding.btnStart.setOnClickListener {
            findNavController().navigate(R.id.action_start_to_menu)
        }
    }
}