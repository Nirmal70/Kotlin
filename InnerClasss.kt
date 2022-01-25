package com.example.demo

fun main(args: Array<String>) {
    val obj = Outer().Inner()

    print(obj.foo())
}
class Outer {
    private val welcomeMessage: String = "Welcome to the Volansys"
    inner class Inner {
        fun foo() = welcomeMessage
    }
}