package com.busrayasar.differentactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //aktiviteler arası veri yollayalım
    fun changePage(view: View){
        //kullanıcı verisi alalım
        //*******************************************************************************
        val editText = findViewById<EditText>(R.id.editText) // editTexti tanımadığı için bunu ekledim
        //****************************************************************************************
        val userInput = editText.text.toString()
        val intent = Intent(applicationContext, MainActivity2::class.java)
        intent.putExtra("Set value:", userInput)
        startActivity(intent) // bununla sayfaya geçiş çalışır

        //SecondActivity::class.java -> ikinci aktiviteye git
    }
}