package com.example.hipotenusa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener{calcularClick()}
        btnLimpiar.setOnClickListener{limpiarClick()}
    }

    private fun calcularClick(){
        if(txtLadoA.text.isEmpty() || txtLadoB.text.isEmpty()){
            val mensaje = "Existen campos vacíos"
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        } else {
            val ladoA = txtLadoA.text.toString().toDouble()
            val ladoB = txtLadoB.text.toString().toDouble()
            var result = 0.0
            result = kotlin.math.sqrt(ladoA.pow(2.0) + ladoB.pow(2.0))
            txtResultado.text = result.toString()
        }
    }

    private fun limpiarClick() {
        txtResultado.text = ""
        txtLadoA.text = null
        txtLadoB.text = null
    }
}