package de.diskostu.demo.aquarium

import kotlin.math.PI

// declare class members directly in the constructor; no need to specify them explicitly in the class
// --> nice
open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    // we *could* do this as a function, but as it is a simple calculation, it's better to define it as a field
    // we create a custom getter here
    open var volume: Int
        get() = width * height * length / 1000
        // calculate the height based on the new volume
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open var water = volume * 0.9


    constructor(numberOfFish: Int) : this() {
        val water = numberOfFish * 2000
        val tank = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}


class TowerTank : Aquarium() {

    override var water = volume * 0.8

    override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) {
            height = (value * 1000) / (width * length)
        }
}