package com.example.fooddeliveryapp.retrofit

class ApiUtils {

    companion object{

        val BASE_URL = "http://kasimadalan.pe.hu/"

        fun getKisilerDaoInterface(): YemeklerDaoInterface {
            return RetrofitClient.getClient(BASE_URL).create(YemeklerDaoInterface::class.java)
        }
    }
}