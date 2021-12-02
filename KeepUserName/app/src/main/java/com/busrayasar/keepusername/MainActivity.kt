package com.busrayasar.keepusername

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences : SharedPreferences // daha sonra init edebilmek için lateinit koyduk
    var takenUserName: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // shared preferences: data klasöründe xml le veri saklarız ama anahtar ve değer eşleşmesi gibi küçük verileri
        sharedPreferences = this.getSharedPreferences("com.busrayasar.keepusername", Context.MODE_PRIVATE)

        takenUserName =sharedPreferences.getString("User:", "") //kaydedilen ismi alıyoruz
        if (takenUserName != null){
            val textView = findViewById<TextView>(R.id.textView) //  tanımadığı için bunu ekledim
            textView.text = "Saved User Name ${takenUserName}"
        }


    }

    @SuppressLint("SetTextI18n")
    fun save(view: View){ //bir görünüm tarafından çağrılacağı için view: View olmalı
        //*******************************************************************************
        val editText = findViewById<EditText>(R.id.editText) // editTexti tanımadığı için bunu ekledim
        //****************************************************************************************
        val userName = editText.text.toString()
        if(userName == ""){
            Toast.makeText(this, "Please enter a value",Toast.LENGTH_LONG).show()
        }else{ // kaydedeceğiz
            sharedPreferences.edit().putString("User:", userName).apply()//sharedPreferences ile kullanıcı adını bu şekilde xmle kaydederiz

            //*******************************************************************************
            val textViewMy = findViewById<TextView>(R.id.textView) //  tanımadığı için bunu ekledim
            //****************************************************************************************
            textViewMy.text  =  "Saved User Name: ${userName}"
        }

    }
    fun deleteButton(view: View){
        takenUserName = sharedPreferences.getString("User:", "")
        if (takenUserName != null){
            val textView =findViewById<TextView>(R.id.textView)
            textView.text ="User Name: " //textView'ın içini boşalt
            sharedPreferences.edit().remove("User:").apply() //edit ile düzenleyeceğiz ve remove ile silip apply ile değişikliği uyguladık


        }

    }
}
