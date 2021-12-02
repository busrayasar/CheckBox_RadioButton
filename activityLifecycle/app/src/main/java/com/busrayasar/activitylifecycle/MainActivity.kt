package com.busrayasar.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate is called. ")
    }

    override fun onStart() {
        super.onStart()
        println("onStart is called. ")
    }

    override fun onResume() {
        super.onResume()
        println("onResume is called. ")
    }

    override fun onPause() {
        super.onPause()
        println("onPause is called. ")
    }

    override fun onStop() {
        super.onStop()
        println("onStop is called. ")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy is called. ")
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
        finish() //bu fonksiyonla aktivite kapatılır (destroy)
        //SecondActivity::class.java -> ikinci aktiviteye git
    }


}