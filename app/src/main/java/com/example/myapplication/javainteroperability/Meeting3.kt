package com.example.myapplication.javainteroperability

class Meeting3 {

    @JvmField
    var title = "Board"
    companion object {
        @JvmStatic
        fun build() : Meeting3 {
            println("Building...")
            return Meeting3()
        }
    }
}