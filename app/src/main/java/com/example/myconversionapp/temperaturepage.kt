package com.example.myconversionapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class temperaturepage : AppCompatActivity() {

    var Fahrenheit = 0.0
    var convertedTemp = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperaturepage)
        val temperaturehome: ImageButton = findViewById(R.id.temperatureHome)
        val tempInput:EditText= findViewById(R.id.temperatureinput)
        val temperatureresult:TextView=findViewById(R.id.temperatureresult)
        val celsius: Button = findViewById(R.id.celsius)
        val kelvin: Button = findViewById(R.id.kelvin)

        temperaturehome.setOnClickListener {
            val intent = Intent(this@temperaturepage, MainActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent)
        }
         celsius.setOnClickListener {
             val input: String = tempInput.getText().toString()
             if (input.isEmpty()) {
                 Toast.makeText(this, "EMPTY ENTR", Toast.LENGTH_SHORT).show()
             } else if(!input.isEmpty()) {
                 Fahrenheit = input.toDouble()
             }
                if (Fahrenheit <= 212) {
                    convertedTemp = 5.0 / 9.0 * (Fahrenheit - 32)
                    temperatureresult.setText(convertedTemp.toString()+" Celsius")
                }
            }

        kelvin.setOnClickListener {
            val input: String = tempInput.getText().toString()
            if (!input.isEmpty()) {
                Fahrenheit = input.toDouble()
                if (Fahrenheit <= 212) {
                    convertedTemp = 273.5 + ((Fahrenheit - 32.0) * (5.0 / 9.0))
                    temperatureresult.setText(convertedTemp.toString() + " Kelvin")

                }
            }
        }

    }
}