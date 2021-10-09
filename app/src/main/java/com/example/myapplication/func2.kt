package com.example.myapplication

fun main(){
    getuser("aditya") {
        print(it)
    }
}
fun getuser(name:String, getAge: (age: Int) -> Unit){
    getAge(5)
    print(name)
}