package com.example.myapplication.collectionsandsequences

fun main() {
    val people = mapOf<Int, Person>(1 to Person("Odira"), 2 to Person("Somto"), 3 to Person("Mary"))
    val people2 = mutableMapOf<Int, Person>(1 to Person("Odira"), 2 to Person("Somto"), 3 to Person("Mary"))

    people2.put(4, Person("chika"))

    for ((index, person) in people) {
        println("$index is $person")
    }
}

fun lists() {
    //    val numbers = listOf(1,2,3,4)
//
//    for (num in numbers) {
//        println(num)
//    }
//
//    val n = numbers[0]

//    error ==> numbers.add

    val numbers2 = mutableListOf(1, 2, 3, 4)

    for (num in numbers2) {
        println(num)
    }

    val n2 = numbers2[0]
    println(n2)

    numbers2[0] = 5

    println(numbers2[0])
    numbers2.add(23)

    for (num in numbers2) {
        println(num)
    }
}