package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class LibrarySpec extends FunSuite {

  val library = new Library

  test("searching part of the name should return the entire book") {
    library.searchTitle("Azkaban") shouldBe Set(
      Book("Harry Potter and the Prisoner of Azkaban", "Rowling, J.K.", "iamvmb"),
    )
  }

  test("searching part of the name should return all books that match query") {
    library.searchTitle("Potter") shouldEqual Set(
      Book("Harry Potter and the Deathly Hallows", "Rowling, J.K.", "ipszbehyh"),
      Book("Harry Potter and the Philosopher's Stone", "Rowling, J.K.", "lfzowqpsj"),
      Book("Harry Potter and the Order of the Phoenix", "Rowling, J.K.", "ymjklwq"),
      Book("Harry Potter and the Goblet of Fire", "Rowling, J.K.", "krsmrccb"),
      Book("Harry Potter and the Chamber of Secrets", "Rowling, J.K.", "dvceqblua"),
      Book("Harry Potter and the Prisoner of Azkaban", "Rowling, J.K.", "iamvmb"),
      Book("Harry Potter and the Half-blood Prince:Children's Edition", "Rowling, J.K.", "gdjvia"),
      Book("Harry Potter and the Half-blood Prince", "Rowling, J.K.", "ajaoshq"),
    )
  }

  test("searching part of the authors name should return the entire book") {
    library.searchAuthor("Atkins") shouldBe Set(
      Book("Dr. Atkins' New Diet Revolution:The No-hunger, Luxurious Weight Loss P", "Atkins, Robert C.", "xkglrnd"),
    )
  }

  test("searching part of the authors name should return all books that match query") {
    library.searchAuthor("Rowling") shouldEqual Set(
      Book("Harry Potter and the Deathly Hallows", "Rowling, J.K.", "ipszbehyh"),
      Book("Harry Potter and the Philosopher's Stone", "Rowling, J.K.", "lfzowqpsj"),
      Book("Harry Potter and the Order of the Phoenix", "Rowling, J.K.", "ymjklwq"),
      Book("Harry Potter and the Goblet of Fire", "Rowling, J.K.", "krsmrccb"),
      Book("Harry Potter and the Chamber of Secrets", "Rowling, J.K.", "dvceqblua"),
      Book("Harry Potter and the Prisoner of Azkaban", "Rowling, J.K.", "iamvmb"),
      Book("Harry Potter and the Half-blood Prince:Children's Edition", "Rowling, J.K.", "gdjvia"),
      Book("Harry Potter and the Half-blood Prince", "Rowling, J.K.", "ajaoshq"),
      Book("Tales of Beedle the Bard,The", "Rowling, J.K.", "webvafppur")
    )
  }

}
