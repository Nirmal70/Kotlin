package com.example.demo

fun main() {
    // initialize with duplicate values
    val immutableSet = setOf(6,9,9,0,0,"nirmal","nirmal","Nikhil")

    for(item in immutableSet){
        println(item)
    }
}
