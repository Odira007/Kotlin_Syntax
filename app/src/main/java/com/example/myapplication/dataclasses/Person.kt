package com.example.myapplication.dataclasses

// data class
data class Person (var name: String, var age: Int) {

    override fun toString(): String {
        return "Person(name=$name, age=$age)"
    }
}

fun main() {
    val sam = Person("Sam", 32)
    val samuel = sam.copy(age = 33)
    samuel.name = "Samuel"

    val ogaSamuel = sam.copy(name="oga samuel")
    println("$sam has hashcode ${sam.hashCode()}")
    println("$samuel has hashcode ${samuel.hashCode()}")
    println("$ogaSamuel has hashcode ${ogaSamuel.hashCode()}")

    val (name, age) = samuel
    println("Samuel has the name, ${name} and the age ${age}")

    if (samuel.equals(sam)) {
        println("they are same")
    }
    // Person(name=Sam, age=23) gets printed out because all types derive from
    // any and overrides the toString() method and PERSON is a data class

    if (sam == samuel) println("the same")
    if (samuel === sam) {
        println("they are same")
    } else {
        println("not the same")
    }
}