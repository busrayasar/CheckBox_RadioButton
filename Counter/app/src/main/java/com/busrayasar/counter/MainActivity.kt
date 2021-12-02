package com.busrayasar.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Abstract Class
        object: CountDownTimer(15000, 1000){
            override fun onTick(millisUntilFinished: Long) {

                val textView = findViewById<TextView>(R.id.textView)
                textView.text ="Kalan: ${millisUntilFinished/1000}"


            }

            override fun onFinish() {
                TODO("Not yet implemented")
                val textView = findViewById<TextView>(R.id.textView)
                textView.text ="Kalan: 0"
            }

        }.start() //objenin bittiği yerde bunu yazmazsan çalışmaz


    }
}