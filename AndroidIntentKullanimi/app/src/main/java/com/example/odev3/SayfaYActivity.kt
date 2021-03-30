package com.example.odev3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SayfaYActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_y)

    }
    override fun onBackPressed() {
        val intent = Intent(this@SayfaYActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}