package com.example.myapplication

import android.os.Build
import androidx.annotation.RequiresApi

lateinit var s: String
var name:String?=null
val num= arrayOf(1,2,3,4,"String")
var arr2= arrayOf("aditya","raj")
@RequiresApi(Build.VERSION_CODES.N)
fun main(){
    s="aditya"
    val size:Int=name?.length?:0
    println("s is equal to ${s} of length ${s.length}")
    println(size)
    arr2[0]="ayush"
    println(arr2[0])
    val (a,b,c)= listOf<Int>(1,2,3)
    println("$a,$b,$c")
    val any:Any="Aditya"
    val bany:String=any as String
    var map= mapOf<Int,Int>(1 to 1,2 to 3)
    map.forEach { i, i2 ->
        println(" "+i +i2)
    }
    print(any +" "+ bany)
}