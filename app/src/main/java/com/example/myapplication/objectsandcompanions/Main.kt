package com.example.myapplication.objectsandcompanions

// The use of this comes when we use anonymous inner classes
fun main() {
    val simple = object {
        val name = "Kevin"

        fun printValue() {
            println(name)
        }
    }

    println(simple.name)
    simple.printValue()
}