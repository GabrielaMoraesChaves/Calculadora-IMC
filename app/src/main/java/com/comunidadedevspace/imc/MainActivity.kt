package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editPeso = findViewById<TextInputEditText>(R.id.textInputEditText_peso)
        val editAltura = findViewById<TextInputEditText>(R.id.textInputEditText_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener{


            val pesoStr: String = editPeso.text.toString()
            val alturaStr: String = editAltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {

                Snackbar.make(
                    editPeso,
                    "Preencha Todos os Campos",
                    Snackbar.LENGTH_SHORT
                )
                    .show()

            }else{

            val peso = pesoStr.toFloat()
            val altura = alturaStr.toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2

            println("Acao do botao" + resultado)

            }
        }

    }
}