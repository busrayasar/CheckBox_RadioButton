package com.busrayasar.superherobook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val recycler_view: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Batman, Superman, Spiderman, Aquaman
        //data prep - veri hazırlığı
        var superHeroNames = ArrayList<String>() //İsimleri tutacağımız arraylistimizi tanımladık ve ekledik
        superHeroNames.add("Batman")
        superHeroNames.add("Superman")
        superHeroNames.add("Iron Man")
        superHeroNames.add("Aquaman")
        superHeroNames.add("Spiderman")

        //görselimizi nesneleştirebilmek için Bitmap kullanırız, drawabledaki görselleri değişken olarak burada tanımlamak için
    /*
        //Verimsiz tanımlamalar
        //BitmapFactory.decode ile verileri görsele çeviririz
        //decodeByteArray mesela internetten gelen verileri görsele çevirir
        //bütün uygulama içinde bu kaynaklar tek olacağı için application context kullanıyoruz
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.superman)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.ironman)
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.aquaman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.spiderman)

        var superHeroPic = ArrayList<Bitmap>() //yukarıdaki görseller için Bitmap ArrayList oluşturduk
        superHeroPic.add(batmanBitmap) //Bitmap arrayliste eklemeleri yaptık
        superHeroPic.add(supermanBitmap)
        superHeroPic.add(ironmanBitmap)
        superHeroPic.add(aquamanBitmap)
        superHeroPic.add(spidermanBitmap)
        */
        //Verimli Tanımlamalar

        val batmanDrawableId = R.drawable.batman
        val supermanDrawableId = R.drawable.superman
        val ironmanDrawableId = R.drawable.ironman
        val aquamanDrawableId = R.drawable.aquaman
        val spidermanDrawableId = R.drawable.spiderman

        var superHeroDrawableList = ArrayList<Int>()
        superHeroDrawableList.add(batmanDrawableId)
        superHeroDrawableList.add(supermanDrawableId)
        superHeroDrawableList.add(ironmanDrawableId)
        superHeroDrawableList.add(aquamanDrawableId)
        superHeroDrawableList.add(spidermanDrawableId)


        //Adapter
        //recycler viewda görünümlerin nasıl görüneceği layout manager ile yapılır
        val layoutManager = LinearLayoutManager(this)
        if (recycler_view != null) {
            recycler_view.layoutManager = layoutManager
        }


        //Kendi oluşturduğumuz RecyclerAdapter sınıfından adapter nesnemizi oluşturalım kahraman isimleri ve görsel bitmapi ver
        //adapterla burayı bağlıyoruz
        val adapter = RecyclerAdapter(superHeroNames, superHeroDrawableList)

        if (recycler_view != null) {
            recycler_view.adapter =adapter
        }

    }
}