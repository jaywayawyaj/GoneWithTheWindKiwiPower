package com.company.library

class Library (
                var onLoan :Set[Book] = Set[Book]()
              ) {

  def searchTitle(titleSearch: String): Set[Book] = {
    var result = Set[Book]()
    Books.all.foreach {
      book => if(book.title.contains(titleSearch)) { result += book }
    }
    result
  }

  def searchAuthor(authorSearch: String): Set[Book] = {
    var result = Set[Book]()
    Books.all.foreach {
      book => if(book.author.contains(authorSearch)) { result += book }
    }
    result
  }

  def searchISBN(isbnSearch: String): Book = {
    var result :Book = null
    Books.all.foreach {
      book => if(book.ISBN == isbnSearch) { result = book}
    }
    result
  }

  def lend(isbn :String) = {
    Books.all.foreach {
      book => if(book.ISBN == isbn) { onLoan += book }
    }
  }
}
