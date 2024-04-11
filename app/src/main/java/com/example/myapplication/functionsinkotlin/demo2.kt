package com.example.myapplication.functionsinkotlin

// Single Function Expressions
fun max(a: Int, b: Int): Int = if (a > b) a else b

fun main() {
    println(max(3, 4))
}