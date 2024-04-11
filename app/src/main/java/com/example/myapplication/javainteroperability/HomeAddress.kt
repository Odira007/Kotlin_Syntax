package com.example.myapplication.javainteroperability

fun main() {

}

class HomeAddress : Address {
    // returns a string
    override fun getFirstLine(): String {
        TODO("Not yet implemented")
    }
}

class WorkAddress : Address {
    // returns nullable string - allowed because the String type in the address interface is a platform string
    override fun getFirstLine(): String? {
        TODO("Not yet implemented")
    }

}