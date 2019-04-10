package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers._
import Functions._

class FunctionSpec extends FunSuite {

  test("searching part of the name returns the entire book") {
    searchTitle("Azkaban") shouldBe List(
      Book("Harry Potter and the Prisoner of Azkaban", "Rowling, J.K.", "iamvmb")
    )
  }

  test("searching part of the name returns all books that match query") {
    searchTitle("Potter") shouldEqual List(
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
    searchAuthor("Atkins") shouldBe List(
      Book("Dr. Atkins' New Diet Revolution:The No-hunger, Luxurious Weight Loss P", "Atkins, Robert C.", "xkglrnd"),
    )
  }

  test("searching part of the authors name returns all books that match query") {
    searchAuthor("Rowling") shouldEqual List(
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
    searchISBN("bdyxubc") shouldBe Option(Book("Gruffalo,The", "Donaldson, Julia", "bdyxubc"))
  }
}