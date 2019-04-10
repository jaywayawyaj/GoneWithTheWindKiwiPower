package com.company.library

class Library (
  val books :List[Book] = Books.all
  ) {

  var onLoan :Set[Book] = Set[Book]()

  def searchTitle(titleSearch: String) :List[Book] = {
    val result = books.filter(_.title.contains(titleSearch))
    result
  }

  def searchAuthor(authorSearch: String) :List[Book] = {
    val result = books.filter(_.author.contains(authorSearch))
    result
  }

  def searchISBN(isbnSearch: String) :Option[Book] = {
    val result = books.find(_.ISBN == isbnSearch)
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

  def returnBook(book :Book) :Unit = {
    onLoan -= book
  }
}
