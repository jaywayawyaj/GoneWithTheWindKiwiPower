package com.company.library

class Library (
  val books :List[Book] = Books.all
  ) {

  var onLoan :Set[Book] = Set[Book]()

  def searchTitle(titleSearch: String): List[Book] = {
    val result = books.filter(_.title.contains(titleSearch))
    result
  }

  def searchAuthor(authorSearch: String): List[Book] = {
    val result = books.filter(_.author.contains(authorSearch))
    result
  }

  def searchISBN(isbnSearch: String): Book = {
    var result :Book = null
    books.foreach {
      book => if(book.ISBN == isbnSearch) { result = book }
    }
    result
  }

  def lend(book :Book) :Unit = {
    if(book.reference)
      throw new Exception("Cannot lend reference books")
    else
      onLoan += book
  }

  def isOnLoan(book :Book) :Boolean = {
    onLoan.contains(book)
  }
}
