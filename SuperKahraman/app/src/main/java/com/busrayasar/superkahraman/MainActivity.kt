package com.busrayasar.superkahraman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var num = 0
    var name = ""
    var age : Int? = null
    var job = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            //Scope - kapsam
        num = 10
    }

    fun makeSuperHero(view: View){
        num = 15
        // finding the textView
         name =  nameText.text.toString()
         age = ageText.text.toString().toIntOrNull()
         job = jobText.text.toString()

        if (age == null){
            textsuperHero.text = "Enter a valid age : "
        }else {
            val superhero = SuperHero(name, age!!, job)
            textsuperHero.text = "Name: ${superhero.name} Age: ${superhero.age} Job: ${superhero.job}"
        }

    }
}