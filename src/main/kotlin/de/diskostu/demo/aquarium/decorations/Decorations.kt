package de.diskostu.demo.aquarium.decorations

fun main() {
    makeDecorations()
}

private fun makeDecorations() {
    val d1 = Decorations("granite")
    println("d1 = $d1")

    val d2 = Decorations("slate")
    println("d2 = $d2")

    val d3 = Decorations("slate")
    println("d3 = $d3")

    // two == means "equals", three === means "same object"
    println(d1 == d2)
    println(d2 == d3)

    val d4 = d3.copy()
    println("d3 = $d3")
    println("d4 = $d4")

    val d5 = Decorations2("crystal", "wood", "diver")
    println("d5 = $d5")

    // decomposition: alternative to using getters
    // a bit pointless to me... one needs to know the structure of the data class. Using a getter seems more
    // obvious to me.
    val (rock, wood, diver) = d5
    println("rock = $rock")
    println("wood = $wood")
    println("diver = $diver")

}

data class Decorations(val rocks: String)

data class Decorations2(val rocks: String, val wood: String, val diver: String)