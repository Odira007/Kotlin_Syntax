package com.example.myapplication

fun main() {
    val people = HashMap<String, Int>()
    people["Sam"] = 31
    people["Odira"] = 25
    people["Harry"] = 56

    for ((name, age) in people) {  // Destructuring
        println("$name is $age")
    }

    for (entry in people) {
        println(entry.key + " is " + entry.value)
    }
}

fun overArray() {
    val nums = arrayOf(2, 4, 65, 3, 2)

    for (num in nums) {
        println("Number = $num")
    }

    for((index, num) in nums.withIndex()) {
        println("Number: $num at $index")
    }
}

fun ranges() {
    // using the kotlin idea of ranges
    val numbers = 1..10
    var characters = 'a'..'z'

    // for (int i=0; i<10; i++) {} Java

    for (i in numbers) {
        println("i is $i")
    }

    for (i in 1..10 step 2) {
        println("(step) i is $i")
    }

    for (i in 10 downTo 5) {
        println("(down) i is $i")
    }

    for (i in 1 until  10) {
        println("(down) i is $i")
    }
}