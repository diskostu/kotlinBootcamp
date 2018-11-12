package de.diskostu.demo.kotlinBasics

fun main(args: Array<String>) {
    val numberOfFish = 15
    val numberOfPlants = 10

    // without string template
    println("I have " + numberOfFish + " fishes and " + numberOfPlants + " plants in my aquarium")

    // with string template
    println("I have $numberOfFish fishes and $numberOfPlants plants in my aquarium")

    // add two values, then print them
    println("I have ${numberOfFish + numberOfPlants} fishes and plants")

    // compare by value by using the == operator
    val fish = "fish"
    val fish2 = "fish"
    val plant = "plant"
    println("equal? -> ${fish == plant}")
    println("equal? -> ${fish == fish2}")

    // simple if else statement
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Bad ratio!")
    }

    // number ranges
    if (numberOfFish in 1..10) {
        println("Well, some at least...")
    } else if (numberOfFish in 11..50) {
        println("Not bad!")
    }

    when (numberOfFish) {
        0 -> println("nada!")
        in 1..20 -> println("Yeah!")
        else -> println("too much")
    }

}