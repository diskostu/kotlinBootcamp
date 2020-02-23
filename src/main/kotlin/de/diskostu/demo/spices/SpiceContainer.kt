package de.diskostu.demo.spices

import de.diskostu.demo.spice.Spice

data class SpiceContainer(private val spice: Spice) {

    val label = spice.name
}


fun main() {
    val demo1 = SpiceContainer(Spice("Salt"))

    println("demo1.label = ${demo1.label}")
}