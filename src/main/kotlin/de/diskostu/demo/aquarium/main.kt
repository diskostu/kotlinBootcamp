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

    // without named parameters
    val smallAquarium = Aquarium(20, 15, 30)
    // with named parameters
    val smallAquarium2 = Aquarium(length = 20, width = 15, height = 30)

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("MyAquarium 2: ${myAquarium2.volume} litres with " +
            "length ${myAquarium2.length} " +
            "width ${myAquarium2.width} " +
            "height ${myAquarium2.height}")
}