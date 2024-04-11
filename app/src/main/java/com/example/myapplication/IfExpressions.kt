package com.example.myapplication

fun main() {
    val a = 10
    val b = 46

//    var min = a;
//
//    if (a < b)
//        min = a;
//    else
//        min = b;
//
//    min = if (a < b) a else b


    val min = if (a < b) {
        println("about to return a")
        a
    }
    else {
        println("about to return b")
        b
    }
    println("min is $min")
}