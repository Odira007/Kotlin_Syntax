package com.example.myapplication.collectionsandsequences

fun main() {
    var i = 0
    val numbers = Array<Int>(5) {i++}

    for (num in numbers) {
        println(num)
    }

    var iArray = IntArray(2) {i++}

    for (num in iArray) {
        println(num)
    }

    val people = Array<Person>(5) {Person("Kevin${i++}")}

    for (p in people) {
        println(p)
    }

    var morePeople = arrayOf(Person("Alice"), Person("Bob"), Person("Charlie"))

    for (p in morePeople) {
        println(p)
    }

    val bob = morePeople[1]
    println(bob)

    morePeople.forEachIndexed {index,person ->
        println("$index: $person")
    }
}

data class Person(val name: String)