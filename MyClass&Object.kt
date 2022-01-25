package com.example.demo

class MyClass {
    // Property (data member)
    private var name: String = "Volansys"

    // Member function
    fun printMe() {
        print("IT company- " + name)
    }
}
fun main(args: Array<String>) {
    val obj =MyClass() // Create object obj of myClass class
    obj.printMe() // Call a member function using object
}