package com.busrayasar.fragmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun firstFragment(view: View){
        //fragmentı kullanabilmek için fragment yöneticisini çağırmalısın
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction() //fragment işlemlerini başlatır

        val firstFragment = BlankFragment()
        //Frame layout fragmentı içereceği için transaction içinde onu çağırıyoruz
        fragmentTransaction.replace(R.id.frameLayout, firstFragment).commit() //bu işlemi commitle bitirdik

    }
    fun secondFragment(view: View){
        //fragmentı kullanabilmek için fragment yöneticisini çağırmalısın
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction() //fragment işlemlerini başlatır

        val secondFragment = BlankFragment2()
        //Frame layout fragmentı içereceği için transaction içinde onu çağırıyoruz
        fragmentTransaction.replace(R.id.frameLayout, secondFragment ).commit() //bu işlemi commitle bitirdik
    }



}