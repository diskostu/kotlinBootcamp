package de.diskostu.demo.kotlinBasics

fun main(args: Array<String>) {
//    quiz()
    createDivisibleBySeven()
}


private fun quiz() {
    // integer array with the numbers from 11..15
    val numbers = IntArray(5) { it + 11 }

    // empty mutable List of Strings
    val stringList = mutableListOf<String>()

    for (number in numbers) {
        stringList.add(number.toString())
    }

    println("numbers = ${numbers.contentToString()}")
    println("stringList = $stringList")
}

fun createDivisibleBySeven() {
    val divisibleBySeven = mutableListOf<Int>()

    for (i in 0..100 step 7) {
        divisibleBySeven.add(i)
    }

    println("divisibleBySeven = $divisibleBySeven")
}