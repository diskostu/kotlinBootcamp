package de.diskostu.demo.functions

import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
}

private fun dayOfWeek() {
    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    print("Hey, it's ")

    when (dayOfWeek) {
        1 -> print("sunday")
        2 -> print("monday")
        3 -> print("tuesday")
        4 -> print("wednesday")
        5 -> print("thursday")
        6 -> print("friday")
        7 -> print("saturday")
    }
}