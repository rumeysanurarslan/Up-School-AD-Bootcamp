package com.example.proje
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import java.io.Serializable


data class Urunler(var urun_id : Int,
                   var urun_adi: String,
                   var urun_resim_adi : String,
                   var urun_kategori: String,
                   var urun_fiyat: Double) : Serializable {



    fun sepeteEkle(view: View, urun_adi: String ){
        Toast.makeText(view.context,"${urun_adi} sepete eklendi ! ", Toast.LENGTH_LONG).show()
    }
}


@BindingAdapter("load_image")
fun setImageViewResource(imageView: ImageView, urun_resim_adi: String) {
    imageView.setImageResource(imageView.context.resources.getIdentifier(urun_resim_adi, "drawable", imageView.context.packageName))
}

@BindingAdapter("unicode")
fun setUnicode(textView: TextView, urun_fiyat: Double) {
    textView.text = "${urun_fiyat} \u20BA"
}