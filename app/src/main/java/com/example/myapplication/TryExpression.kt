package com.example.myapplication

fun main() {
    val nums = arrayOf(5)

    val ans = try {
        nums[1]
    } catch (t: Throwable) {
        0
    }
    println("The answer is $ans")
}
