package com.example.polskakuchniatradycyjna_app


import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import kotlin.getValue
import com.example.polskakuchniatradycyjna_app.R
import com.example.polskakuchniatradycyjna_app.databinding.FragmentReadyMealBinding
import com.example.polskakuchniatradycyjna_app.viewmodel.OrderViewModel


class ReadyMealFragment : Fragment(R.layout.fragment_ready_meal) {


    private val viewModel: OrderViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentReadyMealBinding.bind(view)


        binding.btnSoupTomato.setOnClickListener {
            viewModel.setSoup("Pomidorowa", 12.0)
            Toast.makeText(context, "Wybrano Pomidorową", Toast.LENGTH_SHORT).show()
        }
        binding.btnSoupSour.setOnClickListener {
            viewModel.setSoup("Żurek", 16.0)
            Toast.makeText(context, "Wybrano Żurek", Toast.LENGTH_SHORT).show()
        }

        binding.btnMainPork.setOnClickListener {
            viewModel.setMainDish("Schabowy", 35.0)
            Toast.makeText(context, "Wybrano Schabowego", Toast.LENGTH_SHORT).show()
        }
        binding.btnMainPierogi.setOnClickListener {
            viewModel.setMainDish("Pierogi", 28.0)
            Toast.makeText(context, "Wybrano Pierogi", Toast.LENGTH_SHORT).show()
        }


        binding.btnDrinkKompot.setOnClickListener {
            viewModel.setDrink("Kompot", 5.0)
            Toast.makeText(context, "Wybrano Kompot", Toast.LENGTH_SHORT).show()
        }


        binding.btnGoSummary.setOnClickListener {
            findNavController().navigate(R.id.action_ready_to_summary)
        }
    }
}