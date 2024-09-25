package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editPeso = findViewById<TextInputEditText>(R.id.textInputEditText_peso)
        val editAltura = findViewById<TextInputEditText>(R.id.textInputEditText_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener{
            val peso = editPeso.text
            println("Você Clicou!" + peso)

            val altura = editAltura.text
            println("Você Clicou!" + altura)
        }

        }

    }