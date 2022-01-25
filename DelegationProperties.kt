package com.example.demo

import kotlin.reflect.KProperty

class Student
{

    var firstName: String? by NameDelegate() //= null
    // set(value) {
    //     if(value != null && value.length > 5){
    //         field = value.trim().toUpperCase()
    //     }
    // }

    var lastName: String? by NameDelegate()

    override fun toString(): String{
        return "$firstName $lastName"
    }
}

class NameDelegate{
    var formattedValue: String? = null

    operator fun setValue(
        thisRef: Any?,              // thisRef ni jagya a koi bhi name chale
        property: KProperty<*>,
        value: String?
    ){
        if(value != null && value.length > 5){
            formattedValue = value.trim().uppercase()
        }
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String?
    {
        return formattedValue
    }
}

fun main() {

    val student1 = Student()
    student1.firstName = "Nirmal"
    student1.lastName = "Suthar"
    println(student1)
}