package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class LibrarySpec extends FunSuite {

  val library = new Library

  test("searching part of the name should return the entire book") {
    library.searchTitle("Azkaban") shouldBe Book(
      "Harry Potter and the Prisoner of Azkaban", "Rowling, J.K.", "iamvmb"
    )
  }
}
