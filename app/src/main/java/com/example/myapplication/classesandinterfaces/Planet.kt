package com.example.myapplication.classesandinterfaces

abstract class SpaceBody(val name: String) {
    abstract fun calculateMotion()
}

class BlackHole (name: String) : SpaceBody(name) {
    override fun calculateMotion() {
        TODO("Not yet implemented")
    }
}

open class Planet (name: String, diameter: Int, val logger: Logger): SpaceBody(name) { // Primary constructor
    open var population: Long = 0

    override fun calculateMotion() {
        TODO("Not yet implemented")
    }
    init {
        println("We've been created with name: $name")
        population = 0
    }

    val radius: Int = diameter/2 // readonly because its initialized with the val keyword

    constructor(name: String, diameter: Int, gaseous: Boolean, logger: Logger) : this(name, diameter, logger)

    private fun initPopulationRun(startDate: Int, endDate: Int, startPopulation: Int) {
        // do something
    }
    open fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int) : Long {
        logger.debug("Starting the model")
        initPopulationRun(startDate, endDate, startPopulation)
        return population;
    }
}

class HabitablePlanet(name: String, diameter: Int, logger: Logger) : Planet(name, diameter, logger) {
    override var population: Long = 0;

    override fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int) : Long {
        super.runPopulationModel(startDate, endDate, startPopulation)
        return 0;
    }
}