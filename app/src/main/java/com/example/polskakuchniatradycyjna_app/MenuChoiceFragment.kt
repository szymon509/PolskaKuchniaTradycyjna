package com.example.polskakuchniatradycyjna_app


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.polskakuchniatradycyjna_app.MenuChoiceFragment
import com.example.polskakuchniatradycyjna_app.databinding.FragmentMenuChoiceBinding
import com.example.polskakuchniatradycyjna_app.R


class MenuChoiceFragment : Fragment(R.layout.fragment_menu_choice) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentMenuChoiceBinding.bind(view)

        binding.btnReady.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_ready)
        }

        binding.btnCustom.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_custom)
        }
    }
}