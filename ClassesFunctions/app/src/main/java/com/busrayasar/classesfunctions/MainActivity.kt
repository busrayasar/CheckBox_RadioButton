package com.busrayasar.classesfunctions

import android.os.Bundle
import android.view.View
import android.widget.Button

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //myFunc()
       sub(30, 60)
        var x = summ(1, 80)

        // finding the textView
        val textView = findViewById(R.id.textView) as TextView
        textView.text = "Sonuç: ${x}"

        //button click eventiişlemi yapma
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val sumResult = summ(23, 13)
            textView.text = "Sonuç: ${sumResult}"
        }

        classWork()
        NullSecurity()
    }

    fun myFunc(){
        println("Function is running. ")
    }
    fun sub(a:Int, b:Int){
        // finding the textView
        val textView = findViewById(R.id.textView) as TextView
        textView.text = "Result: ${a-b}"
    }
    fun summ(x:Int, y:Int): Int{
        return x + y
    }
    /*
    fun change(view: View){ //bir görünüm tarafından çağrılacak
        val sumRes = summ(30, 67)
        // finding the textView
        val textView = findViewById(R.id.textView) as TextView
        textView.text =  "Sonuç: ${sumRes}"

    }*/

    fun classWork(){
        var superman = SuperKahraman("Superman", 40, "Gazeteci")
        // finding the textView
        val textView = findViewById(R.id.textView) as TextView
        textView.text = "Yas: ${superman.yas}"
        superman.testFunc()
        println(superman.gethairColor())

    }
    fun NullSecurity(){
        //Null: değer atanmamış
        //Defining, tanımlama
        var mystring : String?
        //initializatin
        mystring = "Hello!"
        //Nullability: bir değişkenin değerinin boş olarak tanımlanabilir, null değeri alabilir
        var myAge :Int? = null
        println(myAge)
        //Null Safety:
        //1
        if( myAge != null){
            println(myAge)
        }else {
            println("null value")}
        //2:
         myAge = 25
        // !! -> null olmayacak kesin eminim diyorsun androide(kullanmak sakıncalı), ? -> null olabilir
        println(myAge?.minus(2))

        //3: elvis operatörü
        val result = myAge?.minus(2) ?: 10
        //soldaki sonuca bak nullsa, sağdakini al, null gelmezse kaçsa sonuç onu al
        println(result)
        //4: let
        myAge = 2
         myAge?.let {
            println(it *6)

        }
    }
}