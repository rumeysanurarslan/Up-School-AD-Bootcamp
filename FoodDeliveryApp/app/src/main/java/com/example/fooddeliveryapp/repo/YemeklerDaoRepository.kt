package com.example.fooddeliveryapp.repo

import androidx.lifecycle.MutableLiveData
import com.example.fooddeliveryapp.entity.Yemekler
import com.example.fooddeliveryapp.entity.YemeklerCevap
import com.example.fooddeliveryapp.retrofit.ApiUtils
import com.example.fooddeliveryapp.retrofit.YemeklerDaoInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class YemeklerDaoRepository {

    private val yemeklerListesi: MutableLiveData<List<Yemekler>>
    private val yemeklerdaoInterface: YemeklerDaoInterface

    init {
        yemeklerdaoInterface = ApiUtils.getKisilerDaoInterface()
        yemeklerListesi = MutableLiveData()
    }

    fun yemekleriGetir(): MutableLiveData<List<Yemekler>> {
        return yemeklerListesi
    }

    fun tumYemeklerAl() {
        yemeklerdaoInterface.tumYemekler().enqueue(object : Callback<YemeklerCevap> {
            override fun onResponse(call: Call<YemeklerCevap>, response: Response<YemeklerCevap>) {
                val liste = response.body().yemekler
                yemeklerListesi.value = liste
            }
            override fun onFailure(call: Call<YemeklerCevap>, t: Throwable) {}
        })
    }


}