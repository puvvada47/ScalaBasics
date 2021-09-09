package com.viswanath.scala.basics

object callByNameAndcallByValue {
  def main(args: Array[String]): Unit = {

    def callByValue(x: Long) = {
      println(s"call by value: $x")
      println(s"call by value: $x")

    }

    def callByName(x: => Long) = {
      println(s"call by name: $x")
      println(s"call by name: $x")
    }

    callByValue(System.nanoTime())
    callByName(System.nanoTime())

  }

}


/*

-----------------------------------------------
call by value
-----------------------------------------------
value is computed before call
same value is scoped inside function(value remained same through the function)/same value
used everywhere

call by value: 195894867103500
call by value: 195894867103500

callByValue(System.nanoTime())

callByValue(195894867103500)
def callByValue(195894867103500) = {
      println(s"call by value: 195894867103500")
      println(s"call by value: 195894867103500")

    }

In call by value only value will be passed


----------------------------
call by name
----------------------------
expression is passed literally
expression is evaluated at every use within function

call by name: 195895108312800
call by name: 195895108437600

callByName(System.nanoTime())

 def callByName(System.nanoTime()) = {
      println(s"call by name: System.nanoTime()")
      println(s"call by name: System.nanoTime()")
    }

In call by name, value is evaluated lazy and every time value is recalucated)
*/
