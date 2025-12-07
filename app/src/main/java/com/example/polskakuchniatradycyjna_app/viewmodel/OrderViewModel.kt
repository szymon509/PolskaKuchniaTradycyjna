package com.example.polskakuchniatradycyjna_app.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel : ViewModel() {

    val currentTotal = MutableLiveData(0.0)
    val grandTotal = MutableLiveData(0.0)

    private var currentSum = 0.0
    private var historySum = 0.0

    fun addPrice(price: Double) {
        currentSum += price
        updateTotals()
    }

    fun setSoup(name: String, price: Double) {
        // Uproszczona wersja: po prostu dodaje cenę
        addPrice(price)
    }

    fun setMainDish(name: String, price: Double) {
        addPrice(price)
    }

    fun setDrink(name: String, price: Double) {
        addPrice(price)
    }

    fun confirmPerson() {
        historySum += currentSum
        currentSum = 0.0
        updateTotals()
    }

    fun clearAll() {
        currentSum = 0.0
        historySum = 0.0
        updateTotals()
    }

    private fun updateTotals() {
        currentTotal.value = currentSum
        grandTotal.value = historySum + currentSum
    }
}