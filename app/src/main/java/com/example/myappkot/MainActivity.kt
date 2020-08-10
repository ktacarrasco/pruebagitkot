package com.example.myappkot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Desafio Kotlin","Ejercicio 1 y 2 es crear éste Main")
        Toast.makeText(this, "Esto es un Toast", Toast.LENGTH_SHORT).show()
        /* primer programa kotlin; */
        Log.d("Ejercicio 3", getNameString( "Kta Carrasco"))
        Log.d("Ejercicio 4"," Declarar 3 variables numéricas con los valores 10, 20 y 30")
        Log.d("Ejercicio 4", decVarNum(10, num2 = 20, num3 = 30))
    }



    fun getNameString (name: String):String{
    var temp: String = "mi nombre es : $name"
        return temp
    }

    fun decVarNum(num1: Int, num2: Int, num3: Int): String {
        val temp : String = " variable 1 = $num1  variable 2 = $num2 variable 3 = $num3"
        return temp
    }
}


