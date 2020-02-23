package de.diskostu.demo.book

/**
 * hmm okay
 *
 * @param [title] the title of the book
 * @param [author] writes a book
 * @param [year] the year the book was published first
 *
 * @constructor constructs a book
 */
class Book2(private val title: String, private val author: String, private val year: Int) {

    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getAllData(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

private fun main() {

    val demo = Book2("It", "Stephen King", 1983)

    val allData = demo.getAllData()

    println("Here is your book, <${allData.first}> by ${allData.second} written in ${allData.third}.")
}