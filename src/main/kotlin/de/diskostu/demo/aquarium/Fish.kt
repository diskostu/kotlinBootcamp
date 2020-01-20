package de.diskostu.demo.aquarium

/**
 * Demo class for constructor explanations
 */
// if we use "val" or "var" in the constructor, a class member is created automatically (friendly)
// wenn no "val" or "var" is used, no class member will be created (volumeNeeded)
class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    constructor() : this(volumeNeeded = 9) {
        println("running secondary constructor")
    }

    val size: Int = if (friendly) {
        volumeNeeded
    } else {
        volumeNeeded * 2
    }

}

fun fishExample() {
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}