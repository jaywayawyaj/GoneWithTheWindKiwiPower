package com.company.library

class Library (val books :List[Book] = Books.all) {

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

}
