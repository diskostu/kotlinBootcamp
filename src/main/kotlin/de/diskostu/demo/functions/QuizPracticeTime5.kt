package de.diskostu.demo.functions

fun main(args: Array<String>) {
    println(whatShouldIDoToday("tired", "cloudy", 20))
    println(whatShouldIDoToday("happy", "sunny", -5))
    println(whatShouldIDoToday("happy", "sunny", 15))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" && temperature < 0 -> "go skiing"
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "tired" && weather == "rainy" -> "stay in bed"
        else -> "I don't know"
    }
}