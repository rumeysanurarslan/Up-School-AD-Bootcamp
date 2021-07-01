package com.example.fooddeliveryapp.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fooddeliveryapp.entity.Yemekler
import com.example.fooddeliveryapp.repo.YemeklerDaoRepository

class AnasayfaFragmentViewModel : ViewModel() {
    var yemeklerListesi = MutableLiveData<List<Yemekler>>()
    private val ydaor = YemeklerDaoRepository()

    init {

        yemekleriYukle()
        yemeklerListesi = ydaor.yemekleriGetir()
        Log.e("yemekler",yemeklerListesi.toString())

    }

    fun yemekleriYukle() {
        ydaor.tumYemeklerAl()
    }

}