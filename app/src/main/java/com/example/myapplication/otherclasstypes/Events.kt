package com.example.myapplication.otherclasstypes

sealed class PersonEvents(val id: Int) {
    val name = "Sealed"
    fun doSomething() {}
    class Awake(id: Int): PersonEvents(id)
    class Asleep(id: Int): PersonEvents(id)
    class Eating(val food: String, id: Int): PersonEvents(id)
}

class Cooking(id: Int): PersonEvents(id) {

}

fun main() {
    val evt = PersonEvents.Awake(1)
    handlePersonEvents(evt)
}

fun handlePersonEvents(evt: PersonEvents) {
    when (evt) {
        is PersonEvents.Awake -> {
            println("Awake $evt.id")
        }
        is PersonEvents.Asleep -> {}
        is PersonEvents.Eating -> {
            println("Eating: ${evt.id}, ${evt.food}")
        }
        is Cooking -> {}
    }
}

