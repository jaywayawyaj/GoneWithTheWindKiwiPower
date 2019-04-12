package com.company.library

class Library (
  val books :List[Book] = Books.all
  ) {

  var onLoan :Set[Loan] = Set[Loan]()

  def searchTitle(titleSearch: String) :List[Book] = {
    books.filter(_.title.contains(titleSearch))
  }

  def searchAuthor(authorSearch: String) :List[Book] = {
    books.filter(_.author.contains(authorSearch))
  }

  def searchISBN(isbnSearch: String) :Option[Book] = {
    books.find(_.ISBN == isbnSearch)
  }

  def lend(book :Book, loanedBy: String) :Unit = {
    if (isOnLoan(book))
      throw new Exception("This book is on loan")
    if(book.reference)
      throw new Exception("Cannot lend reference books")
    else
      onLoan += Loan(book, loanedBy)
  }

  def isOnLoan(bookQuery :Book) :Boolean = {
    onLoan.exists(loan => loan.book == bookQuery)
  }

  def returnBook(book :Book, loanedBy :String) :Unit = {
    if(!isOnLoan(book))
      throw new Exception("This book is not on loan")
    else
      onLoan -= Loan(book, loanedBy)
  }

  def isLoanedBy(customerQuery :Book) :String = {
    onLoan.filter(_.book == customerQuery).head.loanedBy
  }
}

