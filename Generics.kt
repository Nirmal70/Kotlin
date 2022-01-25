package com.example.demo

class Company<T> (text : T){
    var x = text
    init{
        println(x)
    }
}
fun main(args: Array<String>){
    Company<String>("NirmalSuthar")
    Company<Int>(12)
}
