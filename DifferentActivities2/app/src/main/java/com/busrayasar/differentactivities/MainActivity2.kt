package com.busrayasar.differentactivities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //*******************************************************************************
        val textView = findViewById<TextView>(R.id.textView2) // textView tanımadığı için bunu ekledim
        //****************************************************************************************

        val intent = intent
        val get_intent = intent.getStringExtra("Set value:")
         textView.text = get_intent  //intent ile alınan get_intent değişkenini textView'da görüntüleriz
    }
}