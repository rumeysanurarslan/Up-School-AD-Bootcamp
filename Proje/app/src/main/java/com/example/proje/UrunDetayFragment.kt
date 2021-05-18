package com.example.proje

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.proje.databinding.FragmentUrunDetayBinding

class UrunDetayFragment : Fragment() {

    private lateinit var tasarim: FragmentUrunDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_urun_detay, container, false)

        val bundle :UrunDetayFragmentArgs  by navArgs()
        val gelenUrun = bundle.urunNesne

        tasarim.urunNesnesi = gelenUrun
        return tasarim.root
    }




}