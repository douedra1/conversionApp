package com.example.myconversionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class lenghtpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lenghtpage)

        val lenghthome: ImageButton = findViewById(R.id.lenghtHome)
        val lenghtInput: EditText = findViewById(R.id.weightInput)
        val centimeterButton: Button = findViewById(R.id.centimeterID)
        val meterButton: Button = findViewById(R.id.MeterID)
        val kilometerButton: Button = findViewById(R.id.KilometerID)
        val lenghtresult:TextView = findViewById(R.id.lenghtresult)
        var inch=0.0
        var cm=0.0
        var meter=0.0
        var km=0.0

        lenghthome.setOnClickListener {
            val intent = Intent(this@lenghtpage, MainActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }

        centimeterButton.setOnClickListener {
            val input: String = lenghtInput.getText().toString()
            if (!input.isEmpty()) {
                inch = input.toDouble()
                cm  = 2.54 * inch
                lenghtresult.setText(cm.toString()+" Centimeter")
                }
        }

        meterButton.setOnClickListener {
            val input: String = lenghtInput.getText().toString()
            if (!input.isEmpty()) {
                inch = input.toDouble()
                meter  = inch/39.37
                lenghtresult.setText(meter.toString()+" Meter")
            }
        }
        kilometerButton.setOnClickListener {
            val input: String = lenghtInput.getText().toString()
            if (!input.isEmpty()) {
                inch = input.toDouble()
                km  = inch/39370
                lenghtresult.setText(km.toString()+" Kilometer")
            }
        }
    }
}
