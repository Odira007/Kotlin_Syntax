package com.example.myapplication.classesandinterfaces

fun main() {
    println("Started...")

    val logger = StdOutLogger()
    val logger2 = NullLogger()
    val earth = Planet("Earth", 67282, logger2) // class instantiation

    earth.population = 7_000_000_000L
    println("Earth created: ${earth.name} and its radius is ${earth.radius} and its population is ${earth.population}")

    val newPop = earth.runPopulationModel(0, 1000, 100)
    println("new pop is $newPop")
}