package com.company.library

class Library (
//  val books :List[Book] = Books.all
    val books :Books.type = Books
  ) {

  var onLoan :Set[Book] = Set[Book]()

  def searchTitle(titleSearch: String): Set[Book] = {
    var result = Set[Book]()
    books.all.foreach {
      book => if(book.title.contains(titleSearch)) { result += book }
    }
    result
  }

  def searchAuthor(authorSearch: String): Set[Book] = {
    var result = Set[Book]()
    books.all.foreach {
      book => if(book.author.contains(authorSearch)) { result += book }
    }
    result
  }

  def searchISBN(isbnSearch: String): Book = {
    var result :Book = null
    books.all.foreach {
      book => if(book.ISBN == isbnSearch) { result = book  }
    }
    result
  }

  def lend(book :Book) :Unit = {
    if(books.reference.contains(book))
      throw new Exception("Cannot lend reference books")
    else
      onLoan += book
  }

  def bookStatus(book :Book) :String = {
    if(onLoan.contains(book))
      "Unavailable"
    else
      "Available"
  }
}
