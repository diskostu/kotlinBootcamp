package de.diskostu.demo.kotlinBasics

import de.diskostu.demo.spice.Spice

private fun main() {
    val equipment = "fishnet" to "catching fish"

    val demo = "lala" to Spice("Salt")

    val (a, b) = demo
    val a1 = demo.first
    val b1 = demo.second

    val toList = demo.toList()




    println("equipment.first = ${equipment.first}")
    println("equipment.second = ${equipment.second}")

    // option 1: assign the return value of getError() (nameley a Pair) to 1 field
    val error: Pair<String, String> = getError()
    // option 2: deconstruct the return values of getError() to 2 fields
    val (code, text) = getError()

    println("code = $code")
    println("text = $text")


}

/**
 * Sample use of [Pair]. We simulate getting an error, and instead of returning an object which contains the
 * errorcode and the errortext, we return these two values as a [Pair].
 */
fun getError(): Pair<String, String> {
    val errorCode = "1004"
    val errorText = "Error occurred"

    return Pair(errorCode, errorText)
}