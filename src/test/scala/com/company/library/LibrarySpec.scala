package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class LibrarySpec extends FunSuite {

  val library = new Library

  test("searching part of the name returns the entire book") {
    library.searchTitle("Azkaban") shouldBe Set(
      Book("Harry Potter and the Prisoner of Azkaban", "Rowling, J.K.", "iamvmb"),
    )
  }

  test("searching part of the name returns all books that match query") {
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

  test("searching part of the authors name returns the entire book") {
    library.searchAuthor("Atkins") shouldBe Set(
      Book("Dr. Atkins' New Diet Revolution:The No-hunger, Luxurious Weight Loss P", "Atkins, Robert C.", "xkglrnd"),
    )
  }

  test("searching part of the authors name returns all books that match query") {
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

  test("searching for the ISBN returns the expected book") {
    library.searchISBN("bdyxubc") shouldBe Book("Gruffalo,The", "Donaldson, Julia", "bdyxubc")
  }

  test("A book can be lent out") {
    library.lend(Book("Harry Potter and the Deathly Hallows", "Rowling, J.K.", "ipszbehyh"))
    library.onLoan should contain (Book("Harry Potter and the Deathly Hallows", "Rowling, J.K.", "ipszbehyh"))
  }

  test("A reference book cannot be lent out") {
    an [Exception] should be thrownBy library.lend(Book("Codex Seraphinianus", "Serafini, Luigi", "hetdf"))
  }

  test("A book will return as available when it is not on loan") {
    library.bookStatus(Book("Tales of Beedle the Bard,The", "Rowling, J.K.", "webvafppur")) shouldBe "Available"
  }

}
