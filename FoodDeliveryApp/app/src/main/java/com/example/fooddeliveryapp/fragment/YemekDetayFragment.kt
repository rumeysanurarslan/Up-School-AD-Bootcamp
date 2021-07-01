package com.example.fooddeliveryapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.example.fooddeliveryapp.R
import com.example.fooddeliveryapp.databinding.FragmentAnasayfaBinding
import com.example.fooddeliveryapp.databinding.FragmentYemekDetayBinding
import com.example.fooddeliveryapp.viewModel.AnasayfaFragmentViewModel
import com.example.fooddeliveryapp.viewModel.YemekDetayViewModel

class YemekDetayFragment : Fragment() {
    private val viewModel: YemekDetayViewModel by viewModels()
    private lateinit var tasarim: FragmentYemekDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim=DataBindingUtil.inflate(inflater,R.layout.fragment_yemek_detay, container, false)
        // Inflate the layout for this fragment
        tasarim.anasayfaToolbarBaslik = "Yemekler"
        val bundle:YemekDetayFragmentArgs by navArgs()
        val gelenYemek=bundle.yemekNesnesi
        tasarim.yemekNesnesi=gelenYemek
        tasarim.yemekDetayViewModel = viewModel
        tasarim.lifecycleOwner = this
        return tasarim.root
    }


}