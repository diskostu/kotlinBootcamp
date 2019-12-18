package de.diskostu.demo.functions

fun main(args: Array<String>) {
    repeat(10) {
        val fortuneCookie = getFortuneCookie(getBirthday())
        println("fortune = $fortuneCookie")
    }
}

private fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")

    val index = when (birthday) {
        in 1..7 -> 0
        28, 31 -> 1
        else -> birthday.rem(fortunes.size)
    }

    return fortunes[index]
}


private fun getBirthday(): Int {
    println("Enter your birthday")
    return readLine()?.toIntOrNull() ?: 1
}