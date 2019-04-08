package com.company.library

class Library (val books :List[Book] = Books.all) {

  def searchTitle(titleSearch: String): Set[Book] = {
    var result = Set[Book]()
    books.foreach {
      book => if(book.title.contains(titleSearch)) { result += book }
    }
    result
  }

}
