package com.example.fooddeliveryapp.retrofit

import com.example.fooddeliveryapp.entity.YemeklerCevap
import retrofit2.Call
import retrofit2.http.GET


interface YemeklerDaoInterface {
    @GET("yemekler/tum_yemekler.php")
    fun tumYemekler() : Call<YemeklerCevap>

}

