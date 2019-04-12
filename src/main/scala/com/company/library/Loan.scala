package com.company.library
import java.util.Calendar

case class Loan(book: Book, loanedBy: String, date: java.util.Date = Calendar.getInstance.getTime)