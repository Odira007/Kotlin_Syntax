package com.example.myapplication.higherorderfunctions

interface Process {
    fun execute(value: Int)
}

fun main() {
//    fibonacci(8)
//    fibonacci(8, object: Process {
//        override fun execute(value: Int) {
//            println(value)
//        }
//    })
//    fibonacci(8, {a -> println(a) })
//    fibonacci(8, {println(it)})
//    fibonacci(8) {println(it)}
//    fibonacci(8, ::println)
    var total = 0
    fibonacci(8) {total += it}

    println(total)
}

fun fibonacci(limit: Int, process: Process) {
    var prev = 0
    var prevPrev = 0
    var current = 1

    for (i: Int in 1..limit){
        process.execute(current)

        var temp =current
        prevPrev = prev
        prev = temp
        current = prev + prevPrev
    }
}

fun fibonacci(limit: Int, action: (Int) -> Unit) {
    var prev = 0
    var prevPrev = 0
    var current = 1

    for (i: Int in 1..limit){
        action(current)

        var temp =current
        prevPrev = prev
        prev = temp
        current = prev + prevPrev
    }
}

fun fibonacci(limit: Int) {
    var prev = 0
    var prevPrev = 0
    var current = 1

    for (i: Int in 1..limit){
        println(current)

        var temp =current
        prevPrev = prev
        prev = temp
        current = prev + prevPrev
    }
}