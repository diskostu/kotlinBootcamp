package de.diskostu.demo.kotlinBasics

fun main(args: Array<String>) {

    val trout = "trout"
    val haddock = "haddock"
    val snapper = "snapper"

    println("I like to eat $trout, but I really hate $haddock and $snapper")

    when (haddock.length) {
        0 -> println("Bad fish name")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}