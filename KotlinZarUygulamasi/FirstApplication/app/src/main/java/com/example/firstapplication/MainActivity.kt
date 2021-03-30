package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSalla = findViewById<Button>(R.id.buttonSalla)
        val buttonTemizle = findViewById<Button>(R.id.buttonTemizle)
        val zar1 = findViewById<ImageView>(R.id.birinciZar)
        val zar2 = findViewById<ImageView>(R.id.ikinciZar)
        var z = Zar()

        buttonSalla.setOnClickListener {
            Toast.makeText(this@MainActivity, "Zar Atıldı!",Toast.LENGTH_SHORT).show()
            z.zarAt(zar1)
            z.zarAt(zar2)

        }

        buttonTemizle.setOnClickListener {
            Toast.makeText(this@MainActivity, "Zar Temizlendi!",Toast.LENGTH_SHORT).show()
            z.zarTemizle(zar1)
            z.zarTemizle(zar2)
        }

    }



}
