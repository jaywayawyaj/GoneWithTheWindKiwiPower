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
//    if (isOnLoan(book))
//      throw new Exception("This book is on loan")
    if(book.reference)
      throw new Exception("Cannot lend reference books")
    else
      onLoan += Loan(book, loanedBy)
  }

  def isOnLoan(bookQuery :Book) :Boolean = {
    var result = false
    onLoan.foreach(loan => if(loan.book == bookQuery) result = true)
    result
  }

  def returnBook(book :Book, loanedBy :String) :Unit = {
    if(!isOnLoan(book))
      throw new Exception("This book is not on loan")
    else
      onLoan -= Loan(book, loanedBy)
  }

  def onLoanTo(customerQuery :Book) :String = {
    var result = ""
    onLoan.foreach(
      loan => if(loan.book == customerQuery)
        result = loan.loanedBy
    )
    result
  }
}

