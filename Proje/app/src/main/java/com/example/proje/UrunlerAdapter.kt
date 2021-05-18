package com.example.proje

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.proje.databinding.CardTasarimBinding


class UrunlerAdapter(var mContext: Context, var urunlerListesi : List<Urunler>) : RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(urunCardBinding : CardTasarimBinding): RecyclerView.ViewHolder(urunCardBinding.root){
        var tasarim : CardTasarimBinding

        init{
            this.tasarim = urunCardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim =CardTasarimBinding.inflate(layoutInflater, parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position)

        holder.tasarim.urunResim.setImageResource(mContext.resources.getIdentifier(
                urun.urun_resim_adi, "drawable",mContext.packageName
        ))
        holder.tasarim.urunAdi.text = urun.urun_adi
        holder.tasarim.urunCard.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.urunDetayGecis(urun)

            Navigation.findNavController(it).navigate(gecis)
        }
    }


}