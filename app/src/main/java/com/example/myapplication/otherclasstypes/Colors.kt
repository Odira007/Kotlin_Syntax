package com.example.myapplication.otherclasstypes

// ENUMS
enum class ErrorCodes(val error: Int) {
    None(0),
    Unknown(1),
    ConnectionLost(300)
}

fun main() {
    val errorCode = ErrorCodes.ConnectionLost

    when (errorCode) {
        ErrorCodes.None -> {
            println("no error")
        }
        ErrorCodes.Unknown -> {}
        ErrorCodes.ConnectionLost -> {}
    }

    println("errorCode has the name ${errorCode.name}, and has the ordinal ${errorCode.ordinal} and value ${errorCode.error}")

    val error = ErrorCodes.valueOf("Unknown")
    println("errorCode has the name ${error.name}, and has the ordinal ${error.ordinal} and value ${error.error}")

    println(ErrorCodes.entries)
}