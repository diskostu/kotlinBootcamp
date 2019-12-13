package de.diskostu.demo.functions

fun main(args: Array<String>) {
    println("fortune = ${getFortuneCookie()}")
}

private fun getFortuneCookie(): String {
    val fortunes = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")

    println("Enter your birthday")

    // very short way of reading and evaluating user input:
    // val birthday = readLine()?.toIntOrNull() ?: 1

    // here's the long way
    // if the user input makes no sense, we set the birthday to 1.
    val readLine = readLine()
    val birthday = if (readLine == null || readLine.toIntOrNull() == null || readLine.toInt() > 31) {
        println("Birthday set to 1.")
        1
    } else {
        val readValue = readLine.toInt()
        println("readValue = $readValue")
        readValue
    }

    val remainder = birthday % fortunes.size // alternative: birthday.rem(fortunes.size)
    println("remainder = $remainder")
    return fortunes[remainder]
}