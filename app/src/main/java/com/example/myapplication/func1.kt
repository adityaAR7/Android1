package com.example.myapplication

fun main(){
    //showMe(age=23,isActive= false,name="Aditya")//named argument
    list(1,2,3,4)
    var n=4
    var a= Array<Int>(n){0}
    var b = arrayListOf(1,2,3,"a")


}
fun showMe(name:String,age:Int=18,isActive:Boolean=false){
    print("Name $name age $age isActive $isActive")
}
fun list(vararg name:Int){
    for(n in name)
        print(n)
}