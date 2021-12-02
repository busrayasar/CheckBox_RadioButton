package com.busrayasar.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Kotlin Life")
        println("---------------Int------------------")
        println(5*8)
        //num2=11 diyemezsin çünkü kodlar satır satır çalıştığı için hata verir
        //Kotlin variables
        var  num = 5
        var num2 = 10
        println(num * num2)

        //SABITLER "val" ile tanımlanır, değişmez değere sabittir
        val x = 3
        println("x: " + x)
        // x= 7 yapamazsın
        //camelCase - Kotlinde genelde bu
        //snake_case
        val myInt : Int //defining
        myInt = 7 //initialization
        var newInt : Int = 34
        println("--------------Long----------------")
        var myLong : Long =30000000000
        println("myLong: " + myLong)
        println("-----Double & Long -----")
        val pi = 3.14
        val floatpi : Float = 3.14f //float tanımlarken sonuna f koy

        println("--------String--------------")

        val myStr = "My String"
        println(myStr.length)
        val str : String = "200"

        println("---Boolean----")
        var myBool = true //true tanımladıysan bu değişkeni tekrar false yapamazsın
        // <, >, == , != , <=, >=, &&, ||  -> logic ops
        println(4 != 4)

        println("---Veri Tipi Dönüştürme----")
        val int1 = 10
        var int1toLong = int1.toLong()
        println("Coverted to long:" + int1toLong)
        val userInput = "50"
        val userInputtoStr = userInput.toString()
        //Collections
            //Arrays
        val str1 = "Ayse"
        val myArray = arrayOf("Busra", "Zeynep", "Ali", "Veli", str1)
        //DB den aynı anda pek çok veri indirirken array kullanabiliriz bkz. hava durumu verisi çekmek
        //index
        println(myArray[0])  /* == */
        println(myArray.get(0))
        println(myArray.get(1))
        myArray[1] = "Mahmut"
        println(myArray.get(1))
        myArray.set(2, "Baris" )
        val doubleArray = doubleArrayOf(1.0, 3.4, 7.8)
        val mixArray = arrayOf("Busra", 1, 2.3 , true, false)
         println("mixArray: " + mixArray[0])
        //ArrayList
        println("------ArrayList------")
        val nameList = arrayListOf<String>("Busra", "Esra", "Guler","Ayse","Hayat", "Zeynep" )
        nameList.add("Ebru")
        println(nameList.get(4))
        val mixArrayList = arrayListOf<Any>("Busra", 3, 6.7, true) //farklı veri tiplerini kullanmak için
        //Java style ArrayList
        val intArrayListJ = ArrayList<Int>()
        println("------Set------") //Kümedir, her eleman bir kez yer alabilir, duplikasyon yok
        val expArray = arrayOf(8,8,9,9,10,7)
        println("index 2: ${expArray[2]}")
        val mySet = setOf<Int>(7,8,9,9,9,8, 10)
        println(mySet.size)
        //For Each
        mySet.forEach {
        println(it)
        }
        val set2 = HashSet<String>()
        set2.add("Busra")
        set2.add("Busra")
        set2.forEach {
        println(it)}

        println("------Map----------") //Py dictionariese gibi key -> value pairing yapar
        val dietCaloriMap = hashMapOf <String, Int>()
        dietCaloriMap.put("Apple", 100)
        dietCaloriMap.put("Meat", 300)

        println("Calori " + dietCaloriMap.get("Apple"))

        val myMap = HashMap<String,String>()
        myMap.put("HashMap", "hashMapOf")

        val newMap = hashMapOf<String, Int>("Busra" to 25, "Esra" to 30)
        println(newMap.get("Busra"))

        println("-------Math Operations ------")
        var number = 80
        number = number + 1
        number++
        number--
        println("number " + number )
        println(89 > number)
        println(100 > number && 2>3) // && and , || or
        //Remainder - kalanı bulmak
        println(100 % 3)

        //If statements
        println("-------if statements -------" )
        val score = 23
        if(score < 10){
            println("Game over")
        }else if (score >= 10 && score < 20){
            println("Score is good")
        }else{
            println("You're the best!")
        }

        println("-------when -------" ) //javadaki switch, çok else if varken kullanılır
        var grade = 5
        var gradeStr = ""
        when(grade){
            0 -> gradeStr = "Not valid"
            1 -> gradeStr = "Bad"
            2->gradeStr = "Below mid"
            3 -> gradeStr = "Mid"
            4 ->gradeStr = "Good"
            else -> gradeStr = "Very good"
        }

        println("Grade: " + gradeStr)

        //Loops
        println("---------For-------------")
        val numArray = arrayOf(5,10,15,20,25)
        val q = numArray[0] / 5 +3
        println(q)
        for(ind in numArray){
            println(ind )
        }
        for(index in numArray.indices){ //indexleri alman gerekirse bunu kullan
            println(numArray[index] / +3)
        }

        for(indx in 0..9) {
        //0..9 range i belirler
        }
        val myStrArrayList = ArrayList<String>()
        myStrArrayList.add("Busra")
        myStrArrayList.add("Yasar")
        for(str in myStrArrayList){
            println(str)
        }

        myStrArrayList.forEach{
            println(it)
        }
        println("---------While--------------")
        var j = 0
        while (j < 10){
            println("j: " + j)
            j++
        }
        
    }
}