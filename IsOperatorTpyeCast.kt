package com.example.demo

fun main(args: Array<String>) {
    val str1: String? = "Voansys,Ahemdabad"
    if(str1 !is String)
    {

        println("String is null")
    }
    else {
        println("length of String ${str1.length}")
    }
}
