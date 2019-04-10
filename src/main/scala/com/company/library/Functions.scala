package com.company.library

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
