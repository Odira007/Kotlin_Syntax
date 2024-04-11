package com.example.myapplication.classesandinterfaces

import java.lang.IllegalArgumentException

//===================INLINE CLASSES========================
@JvmInline
// in this example the score class will be replaced by the property which in this case is an int
value class Score(val score: Int) {
    init {
        if (score < 0 || score > 100) throw IllegalArgumentException()
    }
}

class Exam {
    fun score(name: String, studentScore: Int) {

        // ...
    }

    fun amendScore(id: Int, newScore: Int) {
    }
}

fun main() {

}