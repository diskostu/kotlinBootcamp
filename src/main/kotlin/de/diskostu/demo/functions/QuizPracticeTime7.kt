package de.diskostu.demo.functions

import kotlin.random.Random

fun main() {
    randomDemo()

    gamePlay(rollDice(6))
    gamePlay2(rollDice2)
}

private fun randomDemo() {
    val random1 = Random.nextInt(0, 100)
    val random2 = { Random.nextInt(0, 100) }

    println("random1 = $random1")
    println("random1 = $random1")
    println("random1 = $random1")
    println("random2 = ${random2()}")
    println("random2 = ${random2()}")
    println("random2 = ${random2()}")
}

fun gamePlay(rollDice: Int) {
    println("rollDice = $rollDice")
}

fun gamePlay2(rollDice2: (Int) -> Int) {
    println("rollDice2 = " + rollDice2.invoke(6))
}


// implicit type notation
val rollDice = { sides: Int -> if (sides == 0) 0 else Random.nextInt(1, sides) }

// function type notation
val rollDice2: (Int) -> Int = { sides -> if (sides == 0) 0 else Random.nextInt(sides) + 1 }


