package com.example.polskakuchniatradycyjna_app

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.polskakuchniatradycyjna_app.databinding.FragmentTotalBarBinding
import com.example.polskakuchniatradycyjna_app.viewmodel.OrderViewModel
import com.example.polskakuchniatradycyjna_app.TotalBarFragment


class TotalBarFragment : Fragment(R.layout.fragment_total_bar) {

    private val viewModel: OrderViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentTotalBarBinding.bind(view)


        viewModel.currentTotal.observe(viewLifecycleOwner) { amount ->
            binding.tvCurrent.text = "Bieżące: $amount zł"
        }


        viewModel.grandTotal.observe(viewLifecycleOwner) { total ->
            binding.tvTotal.text = "Razem: $total zł"
        }
    }
}