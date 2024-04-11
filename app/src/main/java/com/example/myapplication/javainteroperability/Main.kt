package com.example.myapplication.javainteroperability

fun main() {
    val m = Meeting2("Meeting title")

    m.backgroundSave { println("Meeting $it. saved")}
    m.backgroundSave (::println)
}