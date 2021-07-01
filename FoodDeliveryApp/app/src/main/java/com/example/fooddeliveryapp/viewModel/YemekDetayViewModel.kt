package com.example.fooddeliveryapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class YemekDetayViewModel: ViewModel() {
    private val _counter = MutableLiveData<Int>()
    val counter : LiveData<Int>
        get() = _counter

    init {
        _counter.value = 1
    }

    fun counterIncreased(){
        _counter.value = (_counter.value)?.plus(1)
    }

    fun counterDecreased(){
        if ((_counter.value!!) > 0) {
            _counter.value = (_counter.value)?.minus(1)
        }
    }

}