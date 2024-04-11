package com.example.myapplication.javainteroperability

fun main() {
    val m = Meeting()
//
//    // nulls and java
//    val title: String? = m.title
//
//    println(title)

//    m.addTitle("meeting title")

//    val title2 = m.titleCanBeNull() ?: "No title"

    val title2 = m.titleCanBeNull()
    val size = title2?.length

    println("Title2: $title2")
}