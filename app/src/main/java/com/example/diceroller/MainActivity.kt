package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener(){
            //lanza un pup up en la pantalla al usuario
           // Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
            rollDice()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
       // val resultText: TextView = findViewById(R.id.result_text) la clase R contiene todos los id y las clases que hay en el proyecto

        val randomInt = Random().nextInt(6) + 1//arroja al azar numeros del 1 al 6
       // resultText.text = randomInt.toString()

        //Elija el recurso dibujable correcto según el valor de randomInt:
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //Reemplace la referencia a TextView con ImageView:
        //val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)//Finalmente, asigna el recurso dibujable de arriba a imagenDice:
    }
}