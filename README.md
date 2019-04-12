# Gone With The Wind - Kiwi Power Tech Test

My TDD'd attempt at the Library tech test in Scala provided by Kiwi Power. My first attempt at using Scala and it's testing framework FunSuite. Full specification in the appendix.

## Technologies Used
 - Scala
 - Funsuite

## My approach

I started off reasonably clueless about Scala, strongly typed and function programming in general! Primarily I tried to understand these concepts better using official documentation as well as other internet resources(SGoogle, StackOverflow, Youtube etc).
I began by approaching it from the OO/imperative paradigm that I am more familiar with and tried in paces to make it more functional (purer functions etc), although I think my success in this field was reasonably limited.

Getting my head around how to successfully use a strongly types language like Scala was a nice challenge - it forced me to think deeply about what I expected from every line I wrote.
It took a while to get the ball rolling in this respect, just writing functions and using them correctly felt tricksome to begin with. 
Once I'd got it moving I started to feel more comfortable using Scala, though.

I started off with the initial user stories and tried to find a solution which answered them elegantly before moving on to the extended stories. I also catered for a couple of edge cases which were not in the user stories as I felt they made sense (IE. books which are not on loan being un-returnable and vice versa)
I am happy with where I got to, although I'd begun to work on the time/overdue aspect and would have liked to have finished that.

## Notes

There are various areas in this program where I feel improvements could be made, amongst them are:

- using a more functional approach
    - I struggled to understand how to implement a truly functional style, and with the option of using a more OO approach I feel I relied on that quite heavily
- unclear/hard to read lines
    - in my isLoanedBy function I have a long line of functions to get the name of the borrower - I am not certain if I should have kept it as a loop. I feel like the line I left is perhaps a little unclear, but I was striving to be more 'Scala-esque' (as a person qho answered my query on StackOverflow cited with regards to another loop elsewhere)
- removing time fully from my project
    - When I tried to remove `import java.util.Calendar` from y project it would stop over half of my tests working, an error which occurred only an hour before it was due to be submitted and I have not yet worked out how to fix it! (Screenshot of error attached - would love some clarity if you have any)
    ![screenshot](https://github.com/jaywayawyaj/GoneWithTheWindKiwiPower/blob/master/public/Screenshot%202019-04-12%20at%2011.26.24.png) 
    
# Appendix

## Instructions

You have a library of books and are offering them to the world - you are lending so many books now that it is becoming hard to keep track of what you have.  You decided to use your programming fu to build an application which can keep track of them for you.

##### Getting started

* clone the project
* import via IntelliJ IDEA

##### Requirements

* implements the user stories listed below (optional ones not required)
* compiles
* has tests
* frequent commits

##### User Stories

```text
As a visitor,
So that I can find books I am looking for,
I need to be able search books by partial title
```

```text
As a visitor,
So that I can find books I am looking for,
I need to be able search books by partial author
```

```text
As a visitor,
So that I can find books I am looking for,
I need to be able to search by full ISBN
```

```text
As a librarian,
So that I can help my community,
I need to be able to lend books to visitors
```

```text
As a librarian,
So that I can protect my expensive books,
I don't want to lend reference books
```

```text
As a librarian,
So that I can manage my library correctly,
I need to know whether a book is available or on loan
```

---

##### Optional extra stories

```text
As a librarian,
So that I can update my stock levels,
I need to be able update the library when a book is returned 
```

```text
As a librarian,
So that I can manage my library correctly,
I need to know who has a book that is on loan
```

```text
As a librarian,
So that I can manage my library correctly,
I need to know which books are late
```

```text
As a librarian,
So that I can manage my library correctly,
I need to know who has a book that is late
```

```text
As a librarian,
So that I can manage my library correctly,
I want to fine users who are late returning their books

```


