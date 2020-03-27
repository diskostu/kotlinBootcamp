package de.diskostu.demo.book

private const val MAX_BORROW = 2

open class Book(private val title: String, private val author: String, var pages: Int) {

    companion object {
        private const val BASE_URL = "http://www.example.com/"
    }

    private var currentPage: Int = 1

    open fun readPage() {
        currentPage++
    }

    fun canBorrow(hasBooks: Int): Boolean {
        return hasBooks < MAX_BORROW
    }

    fun printUrl() {
        println("$BASE_URL/$title.html")
    }


}

class EBook(title: String, author: String, format: String = "text", pages: Int) : Book(title, author, pages) {

    private var wordCount: Int = 1

    override fun readPage() {
        wordCount += 250
    }
}

fun Book.getWeight(): Double {
    return pages * 1.5
}

fun Book.tornPages(tornPages: Int) {
    println("removing $tornPages pages")
    if (pages >= tornPages) {
        pages -= tornPages
    } else {
        pages = 0
    }
    println("remaining pages = $pages")
}