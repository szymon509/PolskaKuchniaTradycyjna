package com.example.polskakuchniatradycyjna_app

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.polskakuchniatradycyjna_app.databinding.FragmentCustomMealBinding
import com.example.polskakuchniatradycyjna_app.viewmodel.OrderViewModel

class CustomMealFragment : Fragment(R.layout.fragment_custom_meal) {


    private val viewModel: OrderViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentCustomMealBinding.bind(view)

        binding.btnBasePotatoes.setOnClickListener {
            viewModel.addPrice(6.0)
            Toast.makeText(context, "Dodano Ziemniaki (+6zł)", Toast.LENGTH_SHORT).show()
        }

        binding.btnBaseRice.setOnClickListener {
            viewModel.addPrice(5.0)
            Toast.makeText(context, "Dodano Ryż (+5zł)", Toast.LENGTH_SHORT).show()
        }


        binding.btnMeatCutlet.setOnClickListener {
            viewModel.addPrice(18.0)
            Toast.makeText(context, "Dodano Kotlet (+18zł)", Toast.LENGTH_SHORT).show()
        }
        binding.btnMeatChicken.setOnClickListener {
            viewModel.addPrice(16.0)
            Toast.makeText(context, "Dodano Kurczaka (+16zł)", Toast.LENGTH_SHORT).show()
        }


        binding.btnSalad.setOnClickListener {
            viewModel.addPrice(7.0)
            Toast.makeText(context, "Dodano Surówki (+7zł)", Toast.LENGTH_SHORT).show()
        }
        binding.btnSauce.setOnClickListener {
            viewModel.addPrice(3.0)
            Toast.makeText(context, "Dodano Sos (+3zł)", Toast.LENGTH_SHORT).show()
        }



        binding.btnGoSummaryFromCustom.setOnClickListener {
            findNavController().navigate(R.id.action_custom_to_summary)
        }
    }
}