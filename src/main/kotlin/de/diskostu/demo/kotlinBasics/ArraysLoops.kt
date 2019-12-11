package de.diskostu.demo.kotlinBasics

import kotlin.math.pow

/**
 * Some demos for arrays and loops.
 */

fun main(args: Array<String>) {
//    loopDemo1()
//    loopDemo2()
//    loopDemo3()
    quiz()
}


private fun loopDemo1() {
    println("loopDemo1")
    val fish = 12
    val plants = 5

    val swarm = listOf(fish, plants)

    for (element in swarm) {
        println(element)
    }
}

private fun loopDemo2() {
    println()
    println("loopDemo2")
    val fish = 12
    val plants = 5

    val swarm = listOf(fish, plants)

    for((index, element) in swarm.withIndex()) {
        println("Fish at $index is $element")
    }
}

private fun loopDemo3() {
    println()
    println("loopDemo3")
    println("Here's the alphabet:")
    for(i in 'a'..'z') print(i)
    println()

    println("Here's the numbers from 1 to 10:")
    for(i in 1 until 10) print("$i ") // we cound also write "for(i in 1..10)"
    println()

    println("Here's the numbers from 20 to 10:")
    for(i in 20 downTo 10) print("$i ")
    println()

    println("Here's the numbers from 1 to 20, but with steps of 3:")
    for(i in 1..20 step 3) print("$i ")
    println()
}

/**
 * This leads to the solution of the quiz "Arrays and Loops"
 */
private fun quiz() {
    println()
    println("quiz")
    println("initializing the array, with some debug output")
    val array = Array(7) { index ->
        // note that 1000 pow 0 = 1, and not 0
        // see also https://brilliant.org/wiki/what-is-00/
        val pow = 1000.0.pow(index)
        println("index $index: value $pow")
        pow
    }
    println("initializing of the array is complete")
    println()
}