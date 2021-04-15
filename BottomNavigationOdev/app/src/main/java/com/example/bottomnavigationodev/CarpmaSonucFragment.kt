package com.example.bottomnavigationodev

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_carpma_sonuc.view.*
import kotlinx.android.synthetic.main.fragment_toplama.view.*

class CarpmaSonucFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val tasarim = inflater.inflate(R.layout.fragment_carpma_sonuc, container, false)
        tasarim.toolbarCarpmaSonuc.title = getString(R.string.carpmaHeaderTitle)

        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarCarpmaSonuc)

        val bundle:CarpmaSonucFragmentArgs by navArgs()
        tasarim.carpimSonucText.setText(getString(R.string.carpmaSonuc) + bundle.carpim.toString())

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