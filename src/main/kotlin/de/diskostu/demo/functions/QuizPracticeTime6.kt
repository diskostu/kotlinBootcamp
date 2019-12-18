package de.diskostu.demo.functions

fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    val currySorted = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println("currySorted = $currySorted")

    val beginCEndE1 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    val beginCEndE2 = spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }
    println("beginCEndE1 = $beginCEndE1")
    println("beginCEndE2 = $beginCEndE2")

    val firstThreeWithC = spices.take(3).filter { it.startsWith('c') }
    println("firstThreeWithC = $firstThreeWithC")
}