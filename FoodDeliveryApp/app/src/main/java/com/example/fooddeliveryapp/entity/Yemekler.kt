package com.example.fooddeliveryapp.entity

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.fooddeliveryapp.R
import com.squareup.picasso.Picasso
import java.io.Serializable

data class Yemekler(var yemek_id : Int, var yemek_adi : String, var yemek_resim_adi:String, var yemek_fiyat: Int) : Serializable {


}
