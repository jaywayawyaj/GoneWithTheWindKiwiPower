package com.company.library

class Library (
  val books :List[Book] = Books.all
  ) {

  var onLoan :Set[Book] = Set[Book]()

  def searchTitle(titleSearch: String) :List[Book] = {
    books.filter(_.title.contains(titleSearch))
  }

  def searchAuthor(authorSearch: String) :List[Book] = {
    books.filter(_.author.contains(authorSearch))
  }

  def searchISBN(isbnSearch: String) :Option[Book] = {
    books.find(_.ISBN == isbnSearch)
  }

  def lend(book :Book) :Unit = {
//    if (isOnLoan(book))
//      throw new Exception("This book is on loan")
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