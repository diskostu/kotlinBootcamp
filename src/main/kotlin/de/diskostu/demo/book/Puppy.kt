package de.diskostu.demo.book

import kotlin.random.Random

class Puppy {

    fun playWithBook(book: Book) {
        book.tornPages(Random.nextInt(1, 10))
    }
}

fun main() {
    val puppy: Puppy = Puppy()

    val book = Book("The title", "The author", 100)

    while (book.pages > 0) {
        puppy.playWithBook(book)
    }
}