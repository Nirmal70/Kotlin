package com.example.login

class ToBeCalled {
    companion object Test {
        fun callMe() = println("You are calling me :)")
    }
}
fun main(args: Array<String>) {
    ToBeCalled.callMe()
}