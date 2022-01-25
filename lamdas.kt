package com.example.demo

fun main(){

    val findArea: (Int, Int) -> Int = {length, breadth ->
        length * breadth
    }
    println(findArea(5, 12))
}