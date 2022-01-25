package com.example.login

typealias UserToken= String

fun main()
{
    val user = User("Demo","0101")
    println(user)
    user.token
}

class User(val name:String,val token:UserToken)
