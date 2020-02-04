package de.diskostu.demo.spice

fun main() {

    val spices = listOf(
            Spice("Tomatoe", "mild"),
            Spice("Jalapeno", "very spicy"),
            Spice("Something", "spicy"),
            Spice("Salami", "hot"),
            makeSalt())


    val spicyThings = spices.filter { it.heat > 5 }
    val notSoSpicyThings = spices.filter { it.heat <= 5 }

    println("all spices")
    spices.forEach { println(it) } // alternative to: spices.forEach { spice: Spice -> println(spice) }

    println("spicy spices")
    spicyThings.forEach { println(it) }
    println("not so spicy spices")
    notSoSpicyThings.forEach { println(it) }
}

fun makeSalt(): Spice {
    return Spice("Salt", "mild")
}