package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers._
import Functions._

object TestBooks {
  val all: List[Book] = List(
    Book("Harry Potter and the Deathly Hallows", "Rowling, J.K.", "ipszbehyh"),
    Book("Harry Potter and the Philosopher's Stone", "Rowling, J.K.", "lfzowqpsj"),
    Book("Harry Potter and the Order of the Phoenix", "Rowling, J.K.", "ymjklwq"),
    Book("Harry Potter and the Goblet of Fire", "Rowling, J.K.", "krsmrccb"),
    Book("Harry Potter and the Chamber of Secrets", "Rowling, J.K.", "dvceqblua"),
    Book("Harry Potter and the Prisoner of Azkaban", "Rowling, J.K.", "iamvmb"),
    Book("Harry Potter and the Half-blood Prince:Children's Edition", "Rowling, J.K.", "gdjvia"),
    Book("Harry Potter and the Half-blood Prince", "Rowling, J.K.", "ajaoshq"),
    Book("Dr. Atkins' New Diet Revolution:The No-hunger, Luxurious Weight Loss P", "Atkins, Robert C.", "xkglrnd"),
    Book("Tales of Beedle the Bard,The", "Rowling, J.K.", "webvafppur"),
    Book("Gruffalo,The", "Donaldson, Julia", "bdyxubc"),
    Book("Codex Seraphinianus", "Serafini, Luigi", "hetdf", true)
  )
}

class LibrarySpec extends FunSuite {

  val library = new Library(TestBooks.all)

  test("A book can be lent out") {
    library.lend(Book("Harry Potter and the Deathly Hallows", "Rowling, J.K.", "ipszbehyh"))
    library.onLoan should contain (Book("Harry Potter and the Deathly Hallows", "Rowling, J.K.", "ipszbehyh"))
  }

  test("A reference book cannot be lent out") {
    an [Exception] should be thrownBy library.lend(Book("Codex Seraphinianus", "Serafini, Luigi", "hetdf", true))
  }

  test("A book will return as available when it is not on loan") {
    library.isOnLoan(Book("Tales of Beedle the Bard,The", "Rowling, J.K.", "webvafppur")) shouldBe false
  }

  test("A book will return as unavailable when it is on loan") {
    library.lend(Book("Harry Potter and the Goblet of Fire", "Rowling, J.K.", "krsmrccb"))
    library.isOnLoan(Book("Harry Potter and the Goblet of Fire", "Rowling, J.K.", "krsmrccb")) shouldBe true
  }

  test("A book can be returned") {
    library.lend(Book("Harry Potter and the Goblet of Fire", "Rowling, J.K.", "krsmrccb"))
    library.returnBook(Book("Harry Potter and the Goblet of Fire", "Rowling, J.K.", "krsmrccb"))
    library.isOnLoan(Book("Harry Potter and the Goblet of Fire", "Rowling, J.K.", "krsmrccb")) shouldBe false
  }

}
