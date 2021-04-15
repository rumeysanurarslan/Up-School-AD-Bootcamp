package com.example.bottomnavigationodev

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_carpma.view.*
import kotlinx.android.synthetic.main.fragment_toplama.view.*

class ToplamaFragment : Fragment() {
    private var toplam : Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim =  inflater.inflate(R.layout.fragment_toplama, container, false)
        tasarim.toolbarToplama.title = getString(R.string.toplamaHeaderTitle)

        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarToplama)


        tasarim.toplamaButton.setOnClickListener {
            if(topla(tasarim)){
                val gecis = ToplamaFragmentDirections.toplamaSonucGecis(toplam)
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

    private fun topla(tasarim : View) : Boolean{
        if(tasarim.toplamaIlkSayiInput.text.toString().isNullOrEmpty() ||
            tasarim.toplamaIlkSayiInput2.text.toString().isNullOrEmpty() )
        {
            Toast.makeText(requireContext(), getString(R.string.ipucuMetin), Toast.LENGTH_SHORT).show()
            return false
        }
        else{
            toplam = tasarim.toplamaIlkSayiInput.text.toString().toInt() +
                    tasarim.toplamaIlkSayiInput2.text.toString().toInt()
            return true
        }



    }
}