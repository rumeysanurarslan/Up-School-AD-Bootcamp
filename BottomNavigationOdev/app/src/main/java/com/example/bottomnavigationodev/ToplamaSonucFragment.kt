package com.example.bottomnavigationodev

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_toplama.view.*
import kotlinx.android.synthetic.main.fragment_toplama_sonuc.view.*

class ToplamaSonucFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val tasarim = inflater.inflate(R.layout.fragment_toplama_sonuc, container, false)
        tasarim.toolbarToplamaSonuc.title = getString(R.string.toplamaHeaderTitle)

        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarToplamaSonuc)

        val bundle:ToplamaSonucFragmentArgs by navArgs()
        tasarim.toplamSonucText.setText(getString(R.string.toplamaSonuc) + bundle.toplam.toString())

        return tasarim
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

}