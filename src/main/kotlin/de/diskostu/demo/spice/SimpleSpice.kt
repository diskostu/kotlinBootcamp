package de.diskostu.demo.spice

class SimpleSpice {

    private var name: String = "curry"
    private var spiciness: String = "mild"

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                else -> 0
            }
        }
}