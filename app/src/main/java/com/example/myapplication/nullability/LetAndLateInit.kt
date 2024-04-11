package com.example.myapplication.nullability

fun main() {
    var m1: Meeting3? = null
    var m2 = Meeting3()

    closeMeeting(m2)
    m1?.let {
        closeMeeting(it)
    }
}

fun closeMeeting(m: Meeting3) {
    m.close()
}

class Address

class Meeting3 {
    private lateinit var address: Address
    fun close() {
        println("Meeting closed")
    }

    fun initAddress(address: Address) {

    }
}