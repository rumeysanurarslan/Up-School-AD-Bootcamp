package com.example.odev3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSayfaA.setOnClickListener {
            var intent = Intent(this@MainActivity, SayfaAActivity::class.java)
            startActivity(intent)
        }
        buttonSayfaX.setOnClickListener {
            var intentX = Intent(this@MainActivity, SayfaXActivity::class.java)
            startActivity(intentX)
        }
    }
}