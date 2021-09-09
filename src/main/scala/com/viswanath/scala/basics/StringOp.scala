package com.viswanath.scala.basics

object StringOp {
  def main(args: Array[String]): Unit = {

    val str: String = "Hello, I am learning Scala"

    println(str.charAt(2))
    println(str.substring(7, 11))//str.substring(inclusive,exclusive)=>str.substring(7,11)=>str.substring(7,10)
    println(str.split(" ").toList)
    println(str.startsWith("Hello"))
    println(str.replace(" ", "-"))
    println(str.toLowerCase())
    println(str.toUpperCase)
    println(str.length)

    val aNumberString = "2"
    val aNumber = aNumberString.toInt
    println('a' +: aNumberString :+ 'z')//  +: => Prefix concatenation  :+ => Post concatenation
    println(str.reverse) //reversing the string
    println(str.take(2))

    // Scala-specific: String interpolators.

    // S-interpolators
    val name = "David"
    val age = 12
    val greeting = s"Hello, my name is $name and I am $age years old" //name and age is injected into String value
    val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."
    println(anotherGreeting)

    // F-interpolators
    val speed = 14.23456f
    val myth = f"$name%s can eat $speed%2.2f burgers per minute" //name and age is injected and will also format like %s and %2.2f
    println(myth)

    // raw-interpolator
    println(raw"This is a \n newline")
    val escaped = "This is a \n newline"
    println(raw"$escaped") //raw will escaped the special characters
  }

}
