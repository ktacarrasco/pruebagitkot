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
        Log.d("Ejercicio 3","  Imprimir “Mi nombre es: {Nombre del alumno}")
        Log.d("El resultado es ", getNameString( "Kta Carrasco"))
        Log.d("Ejercicio 4"," Declarar 3 variables numéricas con los valores 10, 20 y 30")
        Log.d("El resultado es", decVarNum(10, num2 = 20, num3 = 30))
        Log.d("Ejercicio 5","  Imprimir la suma de las 3 variables")
        Log.d("El resultado es", sumVar(10, num2 = 20, num3 = 30))
        Log.d("Ejercicio 6","   Declarar 1 variable String y otra variable Char ")
        Log.d("El resultado es", decVarStringChar(var1 = "hola", var2 = 30.toChar()))
        Log.d("Ejercicio 7","   Asignarle el valor “Arataka Reigen” a la variable String y “A” a la variable Char ")
        Log.d("El resultado es", decVar())
        Log.d("Ejercicio 8","  Imprimir la cantidad de caracteres que tiene la variable String y modificar la variable char a otro valor distinto.")
        Log.d("El resultado es", countVar(var1= "string").toString() )
        Log.d("El resultado es", countVar(var1= "string").toChar().toString())
        Log.d("Ejercicio 9 y 10","   Declarar una variable de tipo Float de forma explícita y Asignar un valor a la variable Float ")
        Log.d("El resultado es", varFloat(varfloat=19.5f).toString())
        Log.d("Ejercicio 11 ","   Imprimir los valores máximos que pueden almacenar las variables Byte y Short")
        Log.d("El resultado es", "   Byte  maximo 127 y Short 32767")
        Log.d("Ejercicio 12 ","    Imprimir los valores mínimos que pueden almacenar las variables Int y Long")
        Log.d("El resultado es", "   Int mínimo -2147483648 y Long -9223372036854775808")
        Log.d("Ejercicio 13","  Declarar una variable Boolean con true o false e imprimir su valor")
        Log.d("El resultado es ", varBoolean().toString())
        Log.d("Ejercicio 14 y 16","  Crear una función llamada “imprimiendoParametros” que recibe 2 parámetros String y este imprime el total de caracteres de los dos parámetros.")
        Log.d("El resultado es ", impParam( "el primero" , param2 = "el segundo"))
        Log.d("Ejercicio 15 y 16","   Crear una función llamada “obtieneIVA” que devuelve el valor del IVA (19%)")
        Log.d("El resultado es ", iVa( 5000).toString())
    }

    fun impParam(param1 : String ,param2 : String): String {
        return "estoy imprimiendo dos parametros $param1 y el $param2"
    }

    fun iVa(num1: Int): Double {
        var iva= num1 * 0.19
        return iva
    }


    fun varBoolean(): String {
        val x = true
        val y : Boolean = false
        var temp: String = " variable X = $x variable Y = $y "
        return temp
    }
    private fun varFloat(varfloat: Float): Float {
        var varfloat = 19.5f
        return varfloat
    }


    fun getNameString (name: String):String{
    var temp: String = "mi nombre es : $name"
        return temp
    }

    fun decVarNum(num1: Int, num2: Int, num3: Int): String {
        val temp : String = " variable 1 = $num1  variable 2 = $num2 variable 3 = $num3"
        return temp
    }

    fun sumVar(num1: Int, num2: Int, num3: Int): String {

        return (num1 + num2 + num3).toString()
    }
    fun decVarStringChar(var1: String , var2 :Char): String{
        return " variable String = $var1 variable char = $var2"

    }

    fun decVar(): String {
        var variable = "Arataka Reigen"
        var a = 'A'
        return " variable 1 = $variable variable 2 = $a"
    }

    fun countVar(var1: String): Int {
        return var1.count()
    }


}

