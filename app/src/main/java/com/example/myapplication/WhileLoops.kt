package com.example.myapplication

import androidx.compose.runtime.produceState

fun main() {
    var count = 5
    var outer = 5
    var inner = 5


    outer@ while (outer > 1) {
        outer--
        while (inner > 1) {
            inner--

            if (outer == 3) break@outer
            println("values are $outer and $inner")
        }
        inner = 5
    }

//    while (count > 1) {
//        println(count)
//        count--
//
//        if (count == 3) break
//    }
//    println()
//    count = 5
//    do {
//        println(count)
//        count--
//    } while (count > 1)
}