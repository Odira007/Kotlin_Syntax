package com.example.myapplication.objectsandcompanions

import com.example.myapplication.objectsandcompanions.Logger.debug

// rather than creating a  global object for the logger, you can create ine inside the class itself
class Invoice {
    // Logger can be marked as private ==> private object Logger {}, same as its members
    companion object Logger {
        fun debug(message: String) {
            println("($this) $message")
        }
    }

    fun calculate() {
        debug("calculating invoice")
    }
}

fun main() {
    val invoice = Invoice()
    invoice.calculate()

    val invoice2 = Invoice()
    invoice2.calculate()

    Invoice.debug("like a static")
//    Invoice.Logger.debug("called from main")
}