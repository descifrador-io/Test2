package com.descifrador.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    val randList = arrayListOf("Utkarsh","Anoushka","Manish","Ritu","Prabha")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randButton.setOnClickListener{
            val rand = Random
            val randomNo = rand.nextInt(randList.count())
            randText.text = randList[randomNo]
        }

    }
}
