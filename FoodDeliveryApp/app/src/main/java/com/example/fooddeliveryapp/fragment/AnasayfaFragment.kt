package com.example.fooddeliveryapp.fragment

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.Navigation
import com.example.fooddeliveryapp.R
import com.example.fooddeliveryapp.adapter.YemeklerAdapter
import com.example.fooddeliveryapp.databinding.FragmentAnasayfaBinding
import com.example.fooddeliveryapp.viewModel.AnasayfaFragmentViewModel

class AnasayfaFragment : Fragment(){

    private lateinit var tasarim:FragmentAnasayfaBinding
    private lateinit var adapter: YemeklerAdapter
    private lateinit var viewModel: AnasayfaFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_anasayfa, container, false)
        tasarim.anasayfaToolbarBaslik = "Yemekler"
        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarAnasayfa)

        //this Activity için ,viewLifecycleOwner Fragment için
       viewModel.yemeklerListesi.observe(viewLifecycleOwner,{liste->
           adapter= YemeklerAdapter(requireContext(),liste,viewModel)
           tasarim.yemeklerAdapter=adapter
       })

        return tasarim.root

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        //Fragment içinde viewModel tanımlaması
        val tempViewModel: AnasayfaFragmentViewModel by viewModels()
        this.viewModel = tempViewModel
    }

    override fun onResume() {
        super.onResume()
        viewModel.yemekleriYukle()
    }

}


