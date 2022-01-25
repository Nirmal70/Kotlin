package com.example.demo

fun MutableList<Int>.swap(index1: Int, index2: Int):MutableList<Int>
{
    val tmp = this[index1] // 'this' represents to the list
    this[index1] = this[index2]
    this[index2] = tmp
    return this
}
fun main(args: Array<String>)
{
    val list = mutableListOf(5,10,15)
    println("before swapping the list :$list")
    val result = list.swap(0, 2)
    println("after swapping the list :$result")
}
