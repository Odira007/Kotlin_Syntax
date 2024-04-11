package com.example.myapplication.classesandinterfaces

interface Logger {
    fun debug(message: String)
    fun info(message: String)
}

class StdOutLogger : Logger {
    override fun debug(message: String) {
        println(message)
    }

    override fun info(message: String) {
        println(message)
    }
}

class NullLogger : Logger {
    override fun debug(message: String) {
    }

    override fun info(message: String) {
    }

}