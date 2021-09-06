package com.tejas.model

import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {

    var number = 0

    fun addNumber(){
        number++
    }

    override fun onCleared() {
        super.onCleared()
    }
}