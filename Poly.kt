package com.example.demo

class polyDemo{
    fun display(){
        println("Method with no argument")
    }
    fun display(name:String, age:Int)
    {
        println("")
        println("method with argument")
        println("Name is $name")
        println("Age is $age")
    }
}

fun main(){
    var obj = polyDemo()
    obj.display()
    obj.display("Nirmal", 21)
}