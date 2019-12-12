package de.diskostu.demo.functions

fun main(args: Array<String>) {
    if (args.size != 1) {
        System.err.println("args are empty, or not exactly 1")
        return
    }

    val timeOfDay = args[0].toIntOrNull()
    if (timeOfDay == null) {
        System.err.println("args are empty, or not exactly 1, or not an Int!")
        return
    }

    println(if (timeOfDay < 12) "Good morning, Kotlin" else "Good night, Kotlin")
}