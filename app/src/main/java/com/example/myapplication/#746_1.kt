package com.example.myapplication

import java.util.*
import kotlin.math.ceil

fun main(){
    var sc=Scanner(System.`in`)
    var t:Int= sc.nextInt()
    for(tt in 1..t){
        var n:Int= sc.nextInt()
        var h:Int= sc.nextInt()//!!->to prevent null value
        var a=Array<Int>(n){0}
        for(i in a.indices){
            a[i]= sc.nextInt()
        }
        a.sort()
        var c1=a[n-1];var c2=a[n-2];
        var ans:Int= ceil((2.0*h)/(c1+c2)).toInt()
        ans--
        if((ans and 1)==1){
            if(c1*(ans/2+1) + c2*(ans/2) >=h){
                println(ans)
                continue
            }
        }
        println(ans+1)
    }




}