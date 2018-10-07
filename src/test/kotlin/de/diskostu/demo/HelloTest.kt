package de.diskostu.demo

import kotlin.test.Test
import kotlin.test.assertNotEquals

class HelloTest {

    @Test
    fun foo() {
        val a = "lala"
        val b = "LALA"
        assertNotEquals(a, b)
    }
}