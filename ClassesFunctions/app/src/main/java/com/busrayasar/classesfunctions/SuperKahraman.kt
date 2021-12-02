package com.busrayasar.classesfunctions


class SuperKahraman(var isim: String, var yas: Int, var meslek: String) {
    private var hairColor = "Yellow"
    fun testFunc(){
        println("test")
    }
    //private olarak tanımladığımız propertiyi kullanabilmek için örn:println vb. getter yazarız
    fun gethairColor(): String{ //bu func private değil ulaşabiliriz
        return this.hairColor
    }
    //Setter
    /*
    fun sethairColor(){
        this.hairColor = "Green"
    }
    */

    //Access Levels- erişilebilirlik seviyeleri
    //private, protected, internal, public
    //private: Sadece yazdığın sınıf içerisinden örn.SuperKahraman içerisinden kullanılabilir
    //protected: Oluşturulduğu dosya içerisindeki classlarda kullanılabilir örn. Superkahraman ve onun dışında
    //başka bir class olsaydı SuperKahraman.kt dosyasındaki tüm classlardan erişilirdi
    //internal : sadece kendi modüllerimiz içerisinden ulaşılabilir yani uygulamamızın içerisinden heryerden
    //erişilir ama dış bir kütüphane eklesen oradan ulaşılamaz
    //public: Heryerden ulaşılabilir
    //primary constructor
    /*
    //Properties

    var isim = ""
    var yas= 0
    var meslek = ""
    //Constructor
    constructor(isim: String, yas: Int, meslek: String){
        //this SuperKahraman sınıfının kendisine referans verir
        this.isim = isim
        this.yas = yas
        this.meslek = meslek
        println("Constructor called")
        */



}