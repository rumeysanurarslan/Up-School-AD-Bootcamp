package com.example.odev3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa_a.*

class SayfaAActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_a)

        buttonSayfaB.setOnClickListener {
            var intent = Intent(this@SayfaAActivity, SayfaBActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}