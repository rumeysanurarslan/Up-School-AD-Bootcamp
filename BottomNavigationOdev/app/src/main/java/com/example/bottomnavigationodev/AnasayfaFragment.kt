package com.example.bottomnavigationodev

import android.graphics.Color
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_anasayfa.view.*

class AnasayfaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim =  inflater.inflate(R.layout.fragment_anasayfa, container, false)
        tasarim.toolbarAnasayfa.title = getString(R.string.welcome)


        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarAnasayfa)

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