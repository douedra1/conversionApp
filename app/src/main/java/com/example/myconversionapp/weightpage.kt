package com.example.myconversionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class weightpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weightpage)

        val weighthome: ImageButton = findViewById(R.id.weightHome)
        val weightInput: EditText = findViewById(R.id.weightInput)
        val gramButton: Button = findViewById(R.id.centimeterID)
        val kilogramButton: Button = findViewById(R.id.MeterID)
        val toneButton: Button = findViewById(R.id.toneid)
        val weightresult: TextView = findViewById(R.id.weightresult)
        var pound=0.0
        var gram=0.0
        var kilogram=0.0
        var tone=0.0

        weighthome.setOnClickListener {
            val intent = Intent(this@weightpage, MainActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }

        gramButton.setOnClickListener {
            val input: String = weightInput.getText().toString()
            if (!input.isEmpty()) {
                pound = input.toDouble()
                gram  =  pound * 454
                weightresult.setText(gram.toString()+" Gram")
            }
        }
        kilogramButton.setOnClickListener {
            val input: String = weightInput.getText().toString()
            if (!input.isEmpty()) {
                pound = input.toDouble()
                kilogram  =  pound/2.205
                weightresult.setText(kilogram.toString()+" Kilogram")
            }
        }
        toneButton.setOnClickListener {
            val input: String = weightInput.getText().toString()
            if (!input.isEmpty()) {
                pound = input.toDouble()
                tone  = pound/2205
                weightresult.setText(tone.toString()+" Tone")
            }
        }
    }
}