package com.company.library

class Library (
  val books :List[Book] = Books.all
  ) {

  var onLoan :Set[Book] = Set[Book]()

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

object Functions {

  def searchTitle(titleSearch: String) :List[Book] = {
    val result = Books.all.filter(_.title.contains(titleSearch))
    result
  }

  def searchAuthor(authorSearch: String) :List[Book] = {
    val result = Books.all.filter(_.author.contains(authorSearch))
    result
  }

  def searchISBN(isbnSearch: String) :Option[Book] = {
    val result = Books.all.find(_.ISBN == isbnSearch)
    result
  }

}
