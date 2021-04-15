package com.example.bottomnavigationodev

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_anasayfa.view.*
import kotlinx.android.synthetic.main.fragment_carpma.view.*
import kotlinx.android.synthetic.main.fragment_toplama.view.*

class CarpmaFragment : Fragment() {
    private var carpim = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim =  inflater.inflate(R.layout.fragment_carpma, container, false)
        tasarim.toolbarCarpma.title = getString(R.string.carpmaHeaderTitle)

        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarCarpma)
        tasarim.carpmaButton.setOnClickListener {
            if(carp(tasarim)){
                val gecis = CarpmaFragmentDirections.carpmaSonucGecis(carpim)
                Navigation.findNavController(it).navigate(gecis)
            }
        }

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
    private fun carp(tasarim : View) : Boolean{
        if(tasarim.carpmaIlkSayiInput.text.toString().isNullOrEmpty() ||
            tasarim.carpmaIlkSayiInput2.text.toString().isNullOrEmpty() )
        {
            Toast.makeText(requireContext(), getString(R.string.ipucuMetin), Toast.LENGTH_SHORT).show()
            return false
        }
        else{
            carpim = tasarim.carpmaIlkSayiInput.text.toString().toInt() *
                    tasarim.carpmaIlkSayiInput2.text.toString().toInt()
            return true
        }



    }
}