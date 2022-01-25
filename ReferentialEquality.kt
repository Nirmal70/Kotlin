package com.example.demo

class Person(var name: String)
{

}

fun main(){

    var a = Person("Nirmal")
    var b = Person("Nirmal")

    println(a === b)                // object same che k nai e check kare           // referential equality
    println(a !== b)                                                                // referential inequality
}