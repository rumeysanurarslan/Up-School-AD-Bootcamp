package com.example.proje

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.proje.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    var datas = listOf(
        Urunler(1,"Getir", "logo", "Logo", 0.0),
        Urunler(2,"Getir Yemek", "yemek", "Yemek & Tatlı", 40.0),
        Urunler(3,"Su", "damacana", "Su", 15.0),
        Urunler(4,"Domates", "domates", "Meyve & Sebze", 2.0),
        Urunler(5,"Simit", "simit", "Fırından", 4.0),
        Urunler(6,"Cips", "atistirmalik", "Atıştırmalık", 5.0),
        Urunler(7,"Dondurma", "dondurma", "Dondurma", 6.0),
        Urunler(8,"Hamburger", "yiyecek", "Yiyecek", 8.0),
        Urunler(9,"Kola", "icecek", "İçecek", 13.0),
        Urunler(10,"Pasta", "fit_form", "Fit & Form", 3.0),
        Urunler(11,"Yumurta", "sut_kahvalti", "Süt & Kahvaltı", 23.0),
        Urunler(12,"Makarna", "temel_gida", "Temel Gıda", 11.0),
        Urunler(13,"Diş Macunu", "kisisel_bakim", "Kişisel Bakım", 14.0),
        Urunler(14,"Yumuşatıcı", "ev_bakim", "Ev Bakım", 15.0),
        Urunler(15,"Lamba", "ev_yasam", "Ev & Yaşam", 6.0),
        Urunler(16,"USB kablo", "teknoloji", "Teknoloji", 25.0),
        Urunler(17,"Kedi Maması", "evcil_hayvan", "Evcil Hayvan", 14.0),
        Urunler(18,"Bebek Bezi", "bebek", "Bebek", 16.0),
        Urunler(19,"Cinsel Sağlık", "cinsel_bakim", "Cinsel Sağlık", 12.0),
        Urunler(20,"Çorap", "giyim", "Giyim", 17.0)
    )

    private lateinit var tasarim: FragmentAnasayfaBinding
    private lateinit var urunlerListesi: ArrayList<Urunler>
    private lateinit var  adapter: UrunlerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)

        tasarim.rv.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)

        urunlerListesi = ArrayList()
        adapter = UrunlerAdapter(requireContext(), datas)
        tasarim.rv.adapter = adapter

        return tasarim.root
    }


}