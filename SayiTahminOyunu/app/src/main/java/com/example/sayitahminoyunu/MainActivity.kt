package com.example.sayitahminoyunu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.sayitahminoyunu.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val tahmin: Int = (1..100).random()
    var skor: Int = 100
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tahminEtButon.setOnClickListener {
            kontrol()
        }
    }

    private fun kontrol(){
        if(binding.tahminInput.text.toString().isNullOrEmpty())
        {
            Toast.makeText(this, getString(R.string.ipucuMetin), Toast.LENGTH_SHORT).show()
        }
        else{
            val textInput = binding.tahminInput.text.toString().toInt()
            if(textInput > tahmin){
                binding.textViewIpucu.setText(getString(R.string.kucuk))
                skor--
                binding.textViewSkor.setText(getString(R.string.skor) + skor.toString())
            }
            else if(textInput < tahmin)
            {
                binding.textViewIpucu.setText(getString(R.string.buyuk))
                skor--
                binding.textViewSkor.setText(getString(R.string.skor) + skor.toString())
            }
            else{
                binding.textViewIpucu.setText(getString(R.string.dogruTahmin))
                binding.textViewSkor.setText(getString(R.string.skor) + skor.toString())
                binding.tahminLayout.isEnabled = false

            }
        }

    }
}

