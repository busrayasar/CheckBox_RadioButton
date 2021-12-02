package com.busrayasar.superherobook

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class IntroduceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduce)

        //RecyclerAdapter.kt den gelen intentdeki veriyi alalım
        val intent = intent
        val choosenHeroName = intent.getStringExtra("superHeroName")
        val textView = findViewById<TextView>(R.id.textView)
        textView.text =choosenHeroName

        val choosenHeroPicture = intent.getIntExtra("superHeroPicture", 0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources, choosenHeroPicture)
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageBitmap(bitmap)
        //tıklanınca seçilen superkahraman adını intentle buraya gönderme işi tamamlandı
        //şimdi görselleri göndereceğiz
        /*
        val choosenH = SingletonClass.choosenHero
        val choosenPic = choosenH.picture
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageBitmap(choosenPic)

         */
    }
}