package de.diskostu.demo.book

open class Book(title: String, author: String) {

    private var currentPage: Int = 1;

    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, format: String = "text") : Book(title, author) {

    private var wordCount: Int = 1;

    override fun readPage() {
        wordCount += 250
    }
}