package com.company.library

class Library (val books :List[Book] = Books.all) {

  def searchTitle(titleSearch: String): Book = {
    var result: Book = null
    books.foreach {
      book => if(book.title.contains(titleSearch)) { result = book }
    }
    result
  }

}
