package com.example.myapplication.nullability

fun main() {
//    var name: String?
//    var name1: String
//
//    // nullability gets picked up at compile time in kotlin
//    name = null
//    name1 = "Kevin"
//    name1 = name
    val o = Organizer()

    o.closeMeeting(Meeting())
    o.closeNullableMeeting(Meeting())
    o.closeNullableMeeting(null)
}

class Organizer {
    fun closeMeeting(m: Meeting) {
        m.close()
    }
    fun closeNullableMeeting(m: Meeting?) {
        m?.close()
    }
}

class Meeting {
    fun close() {
        println("Meeting closed")
    }
}