package com.busrayasar.superherobook

import android.graphics.Bitmap

class SingletonClass {
    //companion object singletonda kullanılır ve heryerden ulaşılır
    companion object choosenHero{
        var picture : Bitmap? = null

    }
}