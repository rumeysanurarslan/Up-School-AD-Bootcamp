package com.example.firstapplication

import android.widget.ImageView


class Zar {
    fun zarAt(zarImage: ImageView){
        val randomSayi = (1..6).random()

        when(randomSayi){
            1-> zarImage.setImageResource(R.drawable.dice_1)
            2-> zarImage.setImageResource(R.drawable.dice_2)
            3-> zarImage.setImageResource(R.drawable.dice_3)
            4-> zarImage.setImageResource(R.drawable.dice_4)
            5-> zarImage.setImageResource(R.drawable.dice_5)
            6-> zarImage.setImageResource(R.drawable.dice_6)
            else -> zarImage.setImageResource(R.drawable.empty_dice)
        }
    }
    fun zarTemizle(zarImage: ImageView){
         zarImage.setImageResource(R.drawable.empty_dice)
    }

}