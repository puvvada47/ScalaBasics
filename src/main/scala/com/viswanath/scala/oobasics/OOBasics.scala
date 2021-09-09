package com.viswanath.scala.oobasics

object OOBasics {
  def main(args: Array[String]): Unit = {
    //1 example
    val person = new Person("John", 26)
    //val person1 = new Person("John", 27)
    println(person.x)
    person.greet("Daniel")
    person.greet()

    // 2 example
    val author = new Writer("Charles", "Dickens", 1812)
    val imposter = new Writer("Charles", "Dickens", 1812)
    val novel = new Novel("Great Expectations", 1861, author)

    println(novel.authorAge)
    println(novel.isWrittenBy(imposter))


    //3 example
    val counter = new Counter
    counter.inc.print
    counter.inc.inc.inc.print
    counter.inc(10).print
  }
}

// constructor( class p(a:String,val b:String)-> a is parameter,b is field so that we
// can call by object(new p.b but not new p.a cannot be called since it is a class parameter)
//class body will be executed for every instance
class Person(name: String, val age: Int = 0) {
  // body of class will be executed for every instance
  val x = 2

  println(1 + 3)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading(same method with differnt signatures)
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors(auxillary constructors)
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}







/*
  Novel and a Writer
  Writer: first name, surname, year
    - method fullname

  Novel: name, year of release, author
  - authorAge
  - isWrittenBy(author)
  - copy (new year of release) = new instance of Novel

 */

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}







/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
 */
class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1) // immutability
  }

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter =
    if (n <= 0) this
    else dec.dec(n - 1)

  def print = println(count)
}




/*
* class contains parameters,fields,methods and body of class.
* instance of class=object, object can access class fields and methods but not parameters
* body of class will be called for every instance
* default parameters/fields can be used
* object.a object.func()(if a is a field but not parameter)
*
*
*
*
*
*
* */

