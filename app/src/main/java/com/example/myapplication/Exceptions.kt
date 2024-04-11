package com.example.myapplication

fun main() {
    val nums = arrayOf(5)

    val num0 = nums[0]
//    val num1 = nums[1] throws an exception

//    try {
//        val num1 = nums[1]
//
//    } catch (t: Throwable) {
//        println(t.message)
//    }

    // handling application exceptions
    try {
        throwException()
    } catch (e: Throwable) {
        println(e.message)
    } finally {
        println("Inside finally")
    }

}

fun throwException() {
    throw Exception("Some exception")
}