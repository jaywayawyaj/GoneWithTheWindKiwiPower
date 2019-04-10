package com.company.library

object Functions {

  def searchTitle(titleSearch: String) :List[Book] = {
    Books.all.filter(_.title.contains(titleSearch))
  }

  def searchAuthor(authorSearch: String) :List[Book] = {
    Books.all.filter(_.author.contains(authorSearch))
  }

  def searchISBN(isbnSearch: String) :Option[Book] = {
    Books.all.find(_.ISBN == isbnSearch)
  }

}
