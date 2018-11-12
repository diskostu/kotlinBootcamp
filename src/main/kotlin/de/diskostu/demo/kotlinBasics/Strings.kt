package de.diskostu.demo.kotlinBasics

fun main(args: Array<String>) {

    val numberOfFish = 5
    val numberOfPlants = 10

    // without string template
    println("I have " + numberOfFish + " fishes and " + numberOfPlants + " plants in my aquarium")

    // with string template
    println("I have $numberOfFish fishes and $numberOfPlants plants in my aquarium")

    // add two values, then print them
    println("I have ${numberOfFish + numberOfPlants} fishes and plants")
}