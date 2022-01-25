package com.example.demo

open class pClass{
    fun A(){
        println("base class method")
    }
}

class cClass:pClass(){
    fun B(){
        println("Derived class method")
    }
}

fun main(){
    var obj = cClass()
    obj.A()
    obj.B()
}