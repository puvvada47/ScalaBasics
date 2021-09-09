package com.viswanath.scala.oobasics

object MethodNotations {

  //defining class
  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
  }

  def main(args: Array[String]): Unit = {

    //logic

    val mary = new Person("Mary", "Inception")
    println(mary.likes("Inception"))
    println(mary likes "Inception") // equivalent=>object method parameter
    // infix notation = operator notation (syntactic sugar)=> Infix notation will be used method with single argument

    // "operators" in Scala
    val tom = new Person("Tom", "Fight Club")
    println(mary + tom)
    println(mary.+(tom))

    println(1 + 2)
    println(1.+(2))//all operators are methods so operators can be expressed with methods

    // ALL OPERATORS ARE METHODS.
    // Akka actors have ! ?

    // prefix notation
    val x = -1  // equivalent with 1.unary_- => (- is represented by unary_-)
    val y = 1.unary_-
    // unary_ prefix only works with - + ~ !

    println(!mary)//prefix notation
    println(mary.unary_!)

    // postfix notation
    println(mary.isAlive)
    println(mary isAlive)//syntactic sugar //post fix notation will be used with method with parameterless =>object method

    // apply
    println(mary.apply())
    println(mary()) // equivalent

    /*
      1.  Overload the + operator
          mary + "the rockstar" => new person "Mary (the rockstar)"
      2.  Add an age to the Person class
          Add a unary + operator => new person with the age + 1
          +mary => mary with the age incrementer
      3.  Add a "learns" method in the Person class => "Mary learns Scala"
          Add a learnsScala method, calls learns method with "Scala".
          Use it in postfix notation.
      4.  Overload the apply method
          mary.apply(2) => "Mary watched Inception 2 times"
     */


    //operator as functions(infix notation)
    println((mary + "the Rockstar").apply())
    println(mary.+("the Rockstar").apply())
    println((mary + "the Rockstar")())//equivalent

//prefix notation
    println((+mary).age)
    println(mary.unary_+.age)//equivalent

//post fix notation
    println(mary learnsScala)
    println(mary.learnsScala)//equivalent

//calling apply or with out apply since apply is a special function
    println(mary(10))
    println(mary.apply(10))//equivalent





  }

}


/*


//take ways

1)infix notation
which will be applicable for method with single argument

syntax: object method parameter

Example:

mary.likes("Inception")
mary likes "Inception"



2)prefix notation
!momy
momy.unary_!

3)postfix notation
which will be applicable for method with parameterless

Syntax: object method

mary.learnsScala
mary learnsScala

4)apply method
momy.apply()
momy()

  */
