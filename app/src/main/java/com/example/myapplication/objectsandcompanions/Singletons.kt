package com.example.myapplication.objectsandcompanions

// logger object is a singleton
object Logger {
    fun debug(message: String) {
        println("debug: $this $message")
    }
    fun info(message: String) {
        println("info: $this $message")
    }
}

class Person() {
    fun doWork() {
        Logger.debug("message")
    }
}

fun main() {
    val kevin = Person()
    kevin.doWork()

    val terry = Person()
    terry.doWork()
}