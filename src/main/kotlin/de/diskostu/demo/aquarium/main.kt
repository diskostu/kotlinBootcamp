package de.diskostu.demo.aquarium

fun main(args: Array<String>) {
    buildAuqarium()
}

private fun buildAuqarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} Width: ${myAquarium.width} Height: ${myAquarium.height}")

    myAquarium.height = 80
    println("Height: ${myAquarium.height}")

    println("myAquarium.volume = ${myAquarium.volume}")
}