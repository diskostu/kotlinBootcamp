package de.diskostu.demo.aquarium

class Aquarium {
    var width = 20
    var height = 40
    var length = 100

    // we *could* do this as a function, but as it is a simple calculation, it's better to define it as a field
    // we create a custom getter here
    var volume: Int
        get() = width * height * length / 1000
        // calculate the height based on the new volume
        set(value) {
            height = (value * 1000) / (width * length)
        }
}