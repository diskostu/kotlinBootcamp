package de.diskostu.demo.spice

data class Spice(val name: String, private val spiciness: String = "mild") {

    val heat: Int
        get() {
            return when (spiciness) {
                "very spicy" -> 25
                "hot" -> 15
                "spicy" -> 10
                "mild" -> 5
                else -> 0
            }
        }

    init {
        println("init: name = $name, heat = $heat")
    }
}