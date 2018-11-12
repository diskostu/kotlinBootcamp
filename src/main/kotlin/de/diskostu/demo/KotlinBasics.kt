package de.diskostu.demo

fun main(args: Array<String>) {
    practiceBasicOperations()
    practiceVariables()
    practiceNullability()
    practiceNullabilityLists()
    practiceNullChecks()
}

/**
 * https://classroom.udacity.com/courses/ud9011/lessons/605a8cec-a22b-4778-a682-39b35cf8467b/concepts/336fff8c-1cab-4243-92b0-384d8493080b
 */
fun practiceBasicOperations() {
    println()
    println("practiceBasicOperations")

    println("How many aquariums are needed? -> " + 2.plus(71).plus(233).minus(13).div(30.0))
}

/**
 * https://classroom.udacity.com/courses/ud9011/lessons/605a8cec-a22b-4778-a682-39b35cf8467b/concepts/336fff8c-1cab-4243-92b0-384d8493080b
 */
@Suppress("JoinDeclarationAndAssignment", "UNUSED_VALUE")
fun practiceVariables() {
    println()
    println("practiceVariables")

    var rainbowColor: String
    rainbowColor = "blue"
    rainbowColor = "red"

    val blackColor = "black"
    // this would not work since it's unchangeable
    // blackColor = "something_else"

    println("rainbowColor = $rainbowColor, blackColor = $blackColor")
}

@Suppress("UNUSED_VARIABLE")
        /**
         * https://classroom.udacity.com/courses/ud9011/lessons/605a8cec-a22b-4778-a682-39b35cf8467b/concepts/336fff8c-1cab-4243-92b0-384d8493080b
         */
fun practiceNullability() {
    println()
    println("practiceNullability")

    var rainbowColor = "red"
    // won't work
    // rainbowColor = null

    val greenColor: String? = null
    println("greenColor: $greenColor")

    val blueColor: String?
    blueColor = null
    println("blueColor: $blueColor")
}

        /**
         * https://classroom.udacity.com/courses/ud9011/lessons/605a8cec-a22b-4778-a682-39b35cf8467b/concepts/336fff8c-1cab-4243-92b0-384d8493080b
         */
        @Suppress("UNUSED_VARIABLE", "VARIABLE_WITH_REDUNDANT_INITIALIZER")
        fun practiceNullabilityLists() {
    println()
    println("practiceNullabilityLists")

    val demoList: List<String?> = listOf(null, "demo")
    println("demoList: $demoList")

    var demoListImmutable: List<String?>
    // does not work, every List is per default immutable
    //    demoListImmutable.add

    val demoListMutable: MutableList<String?> = mutableListOf()
    demoListMutable.add("lala")
    println("demoListMutable : $demoListMutable")

    var demoListNullable: List<String>? = listOf("bla", "blubb")
    demoListNullable = null
    println("demoListNullable : $demoListNullable")
}

/**
 * https://classroom.udacity.com/courses/ud9011/lessons/605a8cec-a22b-4778-a682-39b35cf8467b/concepts/336fff8c-1cab-4243-92b0-384d8493080b
 */
fun practiceNullChecks() {
    println()
    println("practiceNullChecks")

    val nullTest1: Int? = -22
    val nullTest2: Int? = null

    // print the value of nullTest1 if it is not null, otherwise print some string
    println("nullTest1: " + (nullTest1 ?: "nullTest1 is null!"))

    // increment the value of nullTest1 if it is not null, otherwise show zero
    println("nullTest1: " + (nullTest1?.inc() ?: 0))

    // increment the value of nullTest1 if it is not null, otherwise show zero
    println("nullTest1: ${(nullTest1?.inc() ?: 0)}")

    // increment the value of nullTest2 if it is not null, otherwise show zero
    println("nullTest2: " + (nullTest2?.inc() ?: 0))
}