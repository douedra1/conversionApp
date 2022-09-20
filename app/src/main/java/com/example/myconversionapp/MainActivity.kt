package com.example.myconversionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val temperatureButton:ImageButton = findViewById(R.id.temperatureid)
        val weightButton: ImageButton = findViewById(R.id.weightid)
        val lenghtButton: ImageButton = findViewById(R.id.lenghtid)


       temperatureButton.setOnClickListener {

           val intent= Intent(this@MainActivity, temperaturepage::class.java)
           startActivity(intent)
       }

        weightButton.setOnClickListener {
            val intent= Intent(this@MainActivity, weightpage::class.java)
            startActivity(intent)
        }
        lenghtButton.setOnClickListener {
            val intent= Intent(this@MainActivity, lenghtpage::class.java)
            startActivity(intent)
        }
    }
}