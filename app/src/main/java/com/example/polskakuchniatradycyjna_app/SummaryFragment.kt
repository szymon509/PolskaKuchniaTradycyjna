package com.example.polskakuchniatradycyjna_app

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.polskakuchniatradycyjna_app.databinding.FragmentSummaryBinding
import com.example.polskakuchniatradycyjna_app.databinding.FragmentSummaryBinding.*
import com.example.polskakuchniatradycyjna_app.viewmodel.OrderViewModel


class SummaryFragment : Fragment(R.layout.fragment_summary) {


    private val viewModel: OrderViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentSummaryBinding.bind(view)


        viewModel.grandTotal.observe(viewLifecycleOwner) { total ->
            binding.tvTotalAmount.text = "Do zapłaty: $total zł"
        }


        binding.btnNextPerson.setOnClickListener {

            viewModel.confirmPerson()

            Toast.makeText(context, "Zapisano! Podaj telefon kolejnej osobie.", Toast.LENGTH_SHORT).show()


            findNavController().navigate(R.id.action_summary_to_menu)
        }


        binding.btnClear.setOnClickListener {
            viewModel.clearAll()
            Toast.makeText(context, "Rachunek skasowany.", Toast.LENGTH_SHORT).show()
        }
    }
}