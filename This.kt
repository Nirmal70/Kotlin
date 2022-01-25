package com.example.demo

class C{

}

class A{
    inner class B{
        fun C.extendingFunction1(){

            val thisAtA = this@A
            println("$thisAtA")

            val thisAtB = this@B
            println("$thisAtB")
        }

        fun methodOfClassB(){
            var cObj = C()
            cObj.extendingFunction1()
        }
    }
}

fun main(){
    var objA = A()
    objA.B().methodOfClassB()     // A$B means B is inner of A ane @ pachi che e memory address
}