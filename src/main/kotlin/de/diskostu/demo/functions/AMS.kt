package de.diskostu.demo.functions

import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello ${args[0]}")
    feedTheFish()
}


fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day and the food is $food")
}


fun fishFood(day: String): String {
    return when (day) {
        // tuesday and saturday are intentionally omitted
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}


fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random.nextInt(7)]
}