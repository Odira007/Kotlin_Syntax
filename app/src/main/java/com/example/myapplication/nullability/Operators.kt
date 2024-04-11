package com.example.myapplication.nullability

fun main() {
    var m1 : Meeting2? = null
    var m2 = Meeting2()

//    m2 = m1!!
    m2 = m1 ?: Meeting2()
    m2.close()

    val saveable = m2 as? ISaveable
    saveable?.save()
}

interface ISaveable {
    fun save()
}

class Organizer2 {
    fun closeMeeting(m: Meeting) {
        m.close()
    }

    fun closeNullableMeeting(m: Meeting?) {
        m?.close()
    }
}

class Meeting2 {
    fun close() {
        println("Meeting closed")
    }
}