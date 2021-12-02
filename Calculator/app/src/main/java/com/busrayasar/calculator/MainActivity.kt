package com.busrayasar.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var num1 : Int? =null // num1 ınt nullable tipinde ve değeri null olarak tanımlandı
    var num2 : Int? = null
    var result: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum (view: View){
        // take input numbers
         num1 = editText.text.toString().toDoubleOrNull()
         num2 = editText.text.toString().toDoubleOrNull()
        if(num1 == null || num2 == null){
            textView.text = "Don't forget to enter the numbers"
        }else{
            result = num1!! + num2!! //sayılar kesinlikle null olmasın
            textView.text = "Result: ${result}" // ${} ile string içinde sayı değişkenini yazdırdık
        }

    }
    fun sub(view: View){
        // take input numbers
         num1 = editText.text.toString().toDoubleOrNull()
         num2 = editText.text.toString().toDoubleOrNull()
        if(num1 == null || num2 == null){
            textView.text = "Don't forget to enter the numbers"
        }else{
            result = num1!! - num2!!
            textView.text = "Result: ${result}" // ${} ile string içinde sayı değişkenini yazdırdık
        }
    }
    fun mult(view: View){
        // take input numbers
        num1 = editText.text.toString().toDoubleOrNull()
        num2 = editText.text.toString().toDoubleOrNull()
        if(num1 == null || num2 == null){
            textView.text = "Don't forget to enter the numbers"
        }else{
            var result = num1!! * num2!!
            textView.text = "Result: ${result}" // ${} ile string içinde sayı değişkenini yazdırdık
        }
    }
    fun div(view: View){
        // take input numbers
        num1 = editText.text.toString().toDoubleOrNull()
        num2 = editText.text.toString().toDoubleOrNull()
        if(num1 == null || num2 == null){
            textView.text = "Don't forget to enter the numbers"
        }else{
            result = num1!! / num2!!
            textView.text = "Result: ${result}" // ${} ile string içinde sayı değişkenini yazdırdık
        }
    }
    
}