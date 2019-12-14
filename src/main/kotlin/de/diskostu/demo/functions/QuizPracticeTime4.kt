package de.diskostu.demo.functions

fun main(args: Array<String>) {
    println(fitMoreFish(10, listOf(4, 4), 3, false)) // expect false
    println(fitMoreFish(10, listOf(4, 4), 1, false)) // expect true
    println(fitMoreFish(10, listOf(4, 4), 1, true)) // expect false
    println(fitMoreFish(20, listOf(4, 4), 8)) // expect true
}


/**
 * This method checks if a new fish fits in an existing aquarium.
 *
 * @param tankSize the size of the aquarium in gallons
 * @param currentFish a list with sizes of the current fishes
 * @param fishSize the size of the fish to be added
 * @param hasDecorations `true`, if the aquarium has decorations, otherwise `false`
 */
private fun fitMoreFish(tankSize: Int,
                        currentFish: List<Int>,
                        fishSize: Int = 2,
                        hasDecorations: Boolean = true): Boolean {
    val currentFishLength = currentFish.sum()
    val effectiveTankSize = if (hasDecorations) tankSize * 0.8 else tankSize.toDouble()

    return effectiveTankSize - currentFishLength - fishSize >= 0
}