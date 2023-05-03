package com.emre.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myNumber: Int // Değer vermeden değişken tanımlama

        var y: Int = 54 // Değişkenler için kullanılır ve değiştirilebilir
        y = 55
        var x = 5
        x = 6
        println(x)

        val number = 5 // Değişkenler için kullanılır ancak değiştirilemez
        //number = 6 // Hata verir

        println("------- Conversion -------")
        //Conversion

        val no = 5
        val doubleNo = no.toDouble()
        println(doubleNo)


        println("------- Array -------")

        //val myArray = arrayOf("Emre", "Yunus", "Eren", 5, 7) -> arrayOf kullanılırsa değerler karışık eklenebilir
        val myArray = arrayOf("Emre", "Yunus", "Eren")
        println(myArray[0])
        println(myArray[1])
        println(myArray[2])

        myArray.set(0, "Yunus") // set -> index numarasını verip içeriğini değiştirir
        myArray.set(1, "Emre")

        println(" ")
        println(myArray[0])
        println(myArray[1])
        println(myArray[2])

        val fixedArray = doubleArrayOf(1.1, 2.2, 3.3) // Bu arrayın içine integer bi değer atılamaz

        // List - ArrayList
        val myListArray = arrayListOf<String>("Yunus", "Emre", "Eren")
        myListArray.add("24") // Liste olduğunda ekleme yapılabilir

        //Mixed ArrayList
        val myMixedArrayList = arrayListOf<Any>("Emre", "Yunus", "Eren", 5, 7)
        println(myMixedArrayList[2])
        println(myMixedArrayList[3])

        println("------- Set -------")
        val myExampleArray = arrayOf(1, 1, 2, 3)
        //println("element 1: " + myExampleArray[0])
        println("element 1: ${myExampleArray[0]}")
        println("element 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1, 1, 2, 3) // değerler sadece bir kere bulunabilir
        println("mySet ${mySet.size} kadar eleman içerir") // 2 adet "1" olduğundan dolayı sonucu 3 verir

        mySet.forEach { println(it) } // Döngüdeki sıradaki elemanı için "it" kullanılır

        val myStringSet = HashSet<String>() // Değerler sadece bir kere bulunabilir

        //Map & HashMap
        println("------- Map -------")

        //Key - Value
        val fruitCaloriesMap = HashMap<String, Int>()
        fruitCaloriesMap.put("Apple", 100)
        fruitCaloriesMap.put("Banana", 150)
        println(fruitCaloriesMap["Apple"])

        //Switch - When
        println("------- Switch - When -------")

        val day = 3
        var dayString = ""

        //Switch - case yapısı burada when ile kullanılır
        when (day) {
            1 -> dayString = "Pazartesi"
            2 -> dayString = "Salı"
            3 -> dayString = "Çarşamba"
            else -> dayString = "" // Switch - case'deki default yerine kullanılır
        }
        println(dayString)

        //For
        println("------- For -------")
        var q : Int
        val forArray = arrayOf(1,2,3,4,5,6,7)
        for (number in forArray) {
            q = number * 2
            println(q)
        }

    }
}