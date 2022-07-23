package com.busrayasar.oopkotlin

class Dog: Animal() {
    fun dogFonk(){
    super.bark()
        //buradaki super inherit ettiği classa referans verir, Yani Animal içindeki bark fonkuna referans verir
    }
    //üst sınıf Animaldeki bark fonksiyonunu override ederek kullanabiliriz
    override fun bark(){
    println("bark: Dog class")
    }

}