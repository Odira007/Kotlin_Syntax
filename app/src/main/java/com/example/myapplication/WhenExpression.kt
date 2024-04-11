package com.example.myapplication

enum class Colours() {
    RED, GREEN, BLUE
}

fun main() {
    val color = Colours.BLUE

    when (color) {
        Colours.GREEN -> println("color is green")
        Colours.RED -> println("color is red")
        else -> println("color is blue")
    }
}

fun bool() {
    val someBool = false

    when (someBool) {
        true -> println("it is true")
        else -> println("it is false")
    }
}

fun range() {
    val num = 1
    val validNumbers = 1..5

    when (num) {
        !in validNumbers -> println("num is valid")
        in 1..10 -> println("num exists in range")
        else -> println("num not exist in range")
    }
}

fun whenSelected() {
    val num = 8

    val isNumEqual6 : Boolean = when (num) {
        6 -> true
        else -> false
    }

    println("num is $num and is equal to 6 is $isNumEqual6")

    val isNumEqualSelectedValue : Boolean = when (num) {
        6, 7 -> true
        else -> false
    }

    println("num is $num and is equal to 6 is $isNumEqualSelectedValue")
}