package com.example.myapplication.higherorderfunctions

import java.io.Closeable
import java.time.LocalDate

class Meeting: Closeable {
    var Title: String = ""
    var When: LocalDate = LocalDate.MIN
    var Who = mutableListOf<String>()

    fun create() {
        println("Created")
    }
    override fun close() {
        println("was closed")
    }
}

fun main() {
    val boardMeeting = Meeting()
    boardMeeting.Title = "board meeting"
    boardMeeting.When = LocalDate.now()
    boardMeeting.Who.add("Odira")

    with(boardMeeting) {
        Title = "board meeting"
        When = LocalDate.now()
        Who.add("Odira")
    }

    boardMeeting.apply {
        Title = "board meeting"
        When = LocalDate.now()
        Who.add("Odira")
    }.create()

    Meeting().use {
        it.create()
    }
}
