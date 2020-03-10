package de.diskostu.demo.aquarium

// option 1: define constant at top level
// accessible anywhere
const val constTopLevel1 = "constTopLevel1"

// only accessible in this file
private const val constTopLevel2 = "constTopLevel2"

// option 2
object Constants {
    const val constObject1 = "constObject1"
    private const val constObject2 = "constObject2"
}

// option 3
class MyClass {
    companion object {
        // statically accessible anywhere
        const val constCompanionObject1 = "constCompanionObject1"

        // only accessible in this class
        private const val constCompanionObject2 = "constCompanionObject2"
    }

    fun demo() {
        // const2 is accessible here
        println(constCompanionObject2)
    }
}


fun main() {
    println(constTopLevel1)
    println(constTopLevel2)
    println(Constants.constObject1)
//    println(Constants.constObject2) // not accessible here
    println(MyClass.constCompanionObject1)
//     println(MyClass.const2) // not accessible here
}