package com.busrayasar.contextproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast, Alert
        //applicationContext -> app'in contexti
        //activitynin contexti için this, this@MainActivity kullanırız

        Toast.makeText(this, "Hello!", Toast.LENGTH_LONG).show()
        //önce  activity context -> this ile başlayıp bir sorun olursa applicationContext'e geçmek daha iyi

    }

    fun showMsg(view: View){ //alert uyarı mesajı
        val alertMsg = AlertDialog.Builder(this@MainActivity)
        alertMsg.setTitle("Wrong Password")
        alertMsg.setMessage("Please enter the correct password!")
        //Lambda gösterimi
        alertMsg.setPositiveButton("Yes", DialogInterface.OnClickListener{ dialog: DialogInterface?, which: Int ->
            Toast.makeText(this, "Enter the password again.", Toast.LENGTH_LONG).show()
        } )

        alertMsg.setNegativeButton("No"){ dialog: DialogInterface?, which: Int ->
            Toast.makeText(this, "You choose 'No' ", Toast.LENGTH_LONG).show()
        }

        alertMsg.show()


    }
}