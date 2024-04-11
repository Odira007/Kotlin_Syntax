package com.example.myapplication

fun main() {
    val count = 6

    when (count) {
        1 -> println("count is 1");
        4 -> println("count is 4")
        else -> {
            println("count is unknown")
        }
    }
}
fun usingIf() {
    var count = 6;

    if (count < 5) {
        println("less")
    } else if (count < 10) {
        println("greater")
    } else {
        println("equal")
    }
}