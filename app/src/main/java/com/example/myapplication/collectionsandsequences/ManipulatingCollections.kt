package com.example.myapplication.collectionsandsequences

fun main() {
    // Predicates
    val numbers = listOf(10,23,42,51,123,6,8,99)

//    val size = numbers.count()
//
//    println("Size is $size")
//
//    val is100 = numbers.any {it > 99}
//
//    println("Number 100 or more $is100")
//
//    val allGreaterThan50 = numbers.all { it > 50}
//
//    println("All > 50 : $allGreaterThan50")

    val over50 = numbers.filter { it > 50 }

    for (item in over50) {
        println(item)
    }

    val multipliedValues = over50.map { it * 2 }

    for (item in multipliedValues) {
        println(item)
    }

    println()
    println()
    val newNumbers = numbers.filter { it > 50 }.map { (it * 2).toString() }
    for (item in newNumbers) {
        println(item)
    }
}