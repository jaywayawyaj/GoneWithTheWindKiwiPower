package com.company.library

class Library (val books :List[Book] = Books.all, var onLoan :Set[Book] = Set[Book]()) {

  def searchTitle(titleSearch: String): Set[Book] = {
    var result = Set[Book]()
    books.foreach {
      book => if(book.title.contains(titleSearch)) { result += book }
    }
    result
  }

  def searchAuthor(authorSearch: String): Set[Book] = {
    var result = Set[Book]()
    books.foreach {
      book => if(book.author.contains(authorSearch)) { result += book }
    }
    result
  }

  def searchISBN(isbnSearch: String): Book = {
    var result :Book = null
    books.foreach {
      book => if(book.ISBN == isbnSearch) { result = book}
    }
    result
  }

  def lend(isbn :String) = {
    var result :Book = null
    books.foreach {
      book => if(book.ISBN == isbn) { result = book }
    }
    onLoan += result
  }

//  def addToOnLoan(book :Book): Unit = {
//    this.onLoan += book
//  }

}
