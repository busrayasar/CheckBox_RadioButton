package com.busrayasar.superherobook

import android.content.Intent
import android.graphics.Bitmap
import android.icu.text.Transliterator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.busrayasar.superherobook.R.id.recyclerViewTextview
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



//An Adapter object acts as a bridge between an AdapterView and the underlying data for that view.
// The Adapter provides access to the data items. The Adapter is also responsible for making a View for each item in the data set.

//main activitydeki superHeroNames ve superHeroBitmaplerini buraya göndermek için tanımlama yaptık
class RecyclerAdapter(val heroList: ArrayList<String>, val heroPic: ArrayList<Int>): RecyclerView.Adapter<RecyclerAdapter.SuperHeroVh>() {

    // görünüm tutucu view holder sınıfımızı bu class'ın içinde oluşturduk
    class SuperHeroVh(itemView : View): RecyclerView.ViewHolder(itemView) {
        //itemview recycler_view layoutuyla türetilecek olan görünümdür
        //viewholderdan oluşturduğumuz nesne ile itemview ı bağlamalıyız
        //bunun primary constructorunda itemView ı isteyip VievHolder içine vermeliyiz

    }
    //View Holder sınıfı oluşturulduğunda yapılacak işlemler, superKahramanVH döndürmeni istiyor
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVh {
        //xml le codu bağlarken inflater kullanılır, Inflater, LayoutInflater, MenuInflater
        //buradaki itemwiew recycler_view ile görünümü bağlamamızı sağlayacak
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view, parent,false)
        return SuperHeroVh(itemView)

    }
    //onCreateViewHolder ın döndürdüğü SuperHeroVh buraya veriyoruz
    override fun onBindViewHolder(holder: SuperHeroVh, position: Int) {
        //val recyclerViewTextview = findViewById<TextView>(R.id.recyclerViewTextview)
        val recTextView = findViewById<TextView>(R.id.recyclerViewTextview)

        holder.itemView.recyclerViewTextview.text  = heroList.get(position)
        //itemview recyclerviewdaki bir rowda ne görüneceği
        holder.itemView.setOnClickListener {
            //diğer aktiviteye geçiş için intent kullanırız
            //tıklanan holder içinden contexti alırız
            val intent = Intent(holder.itemView.context, IntroduceActivity::class.java )
            //veriyi diğer aktiviteye yollamak için
            intent.putExtra("superHeroName",heroList.get(position))
            intent.putExtra("superHeroPicture", heroPic.get(position))//görsel idlerini göndericez
            holder.itemView.context.startActivity(intent) //itemviewın olduğu activity i çalıştıralım

            /*
            //singletonda oluşturduğumuz objeyi kullanalım
            val singleton = SingletonClass.choosenHero
            singleton.picture = heroPic.get(position)
            */

            holder.itemView.context.startActivity(intent)
            //recyclerViewda süperkahraman adına tıklayınca diğer aktiviteye geçişi tammaladık

        }
    }

    override fun getItemCount(): Int {
        //kaç row oluşturulacağını söyleyelim
        return heroList.size // classı tanımlarken tanımladığımız kahraman listesi
    }
}