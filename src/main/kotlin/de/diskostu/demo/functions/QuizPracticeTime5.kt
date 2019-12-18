package de.diskostu.demo.functions

fun main(args: Array<String>) {
    println(whatShouldIDoToday("tired", "cloudy", 20))
    println(whatShouldIDoToday("happy", "sunny", -5))
    println(whatShouldIDoToday("happy", "sunny", 15))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isVeryHot(temperature) -> "please stay inside, it's too hot outside"
        isSkiingWeather(mood, weather, temperature) -> "go skiing"
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "tired" && weather == "rainy" -> "stay in bed"
        else -> "I don't know"
    }
}

// some compact functions
fun isVeryHot(temperature: Int) = temperature > 30

fun isSkiingWeather(mood: String, weather: String, temperature: Int) =
        mood == "happy" && weather == "sunny" && temperature < 0