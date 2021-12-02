package com.busrayasar.activitylifecycle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //*******************************************************************************
        val textView = findViewById<TextView>(R.id.textView2) // editTexti tanımadığı için bunu ekledim
        //****************************************************************************************

        val intent = intent
        val get_intent = intent.getStringExtra("Set value:")
        textView.text = get_intent  //intent ile alınan get_intent değişkenini textView'da görüntüleriz
    }

    fun turnBack(view: TextView){
        //önceki sayfaya geri dönmek için intentimizi tanımlıyoruz.
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish() //bu fonksiyonla aktivite kapatılır (destroy)
    }
}