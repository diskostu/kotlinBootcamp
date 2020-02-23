package de.diskostu.demo.spices

private fun main() {

    val myCurry = Curry("spicy")
    println("myCurry.color = ${myCurry.color}")

}


sealed class Spice(val name: String, private val spiciness: String = "mild") : SpiceColor {

    private val heat: Int
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

    abstract fun prepareSpice()

}

class Curry(spiciness: String) : Spice("Curry", spiciness), Grinder {

    override fun prepareSpice() {
        println("preparing $name")
    }

    override val color: Color
        get() = YellowSpiceColor.color

    override fun grind() {
        println("Grinding some things!")
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}


enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}


/**
 * Singleton
 */
object YellowSpiceColor : SpiceColor {
    override val color: Color
        get() = Color.YELLOW
}