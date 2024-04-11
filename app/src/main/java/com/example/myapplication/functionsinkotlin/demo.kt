package com.example.myapplication.functionsinkotlin

fun padding(original: String, numberToReplace: Int, replacementCharacter: Char = ' '): String {
    val strToAdd =replacementCharacter.toString().repeat(numberToReplace)
    return original + strToAdd
}

fun String.pad(numberToReplace: Int, replacementCharacter: Char = ' '): String {
    val strToAdd =replacementCharacter.toString().repeat(numberToReplace)
    return this + strToAdd
}

fun main() {
    val original = "Odira"
    val new = padding(original, 4)
    println("*****$new******")

    // now when calling the pad function, original is the receiver,
    // and becomes the this inside the function
    val newer = original.pad(4)
    println("*****$newer******")
}

class Person {
    fun addPartner(name: String): String {
        return ""
    }
}