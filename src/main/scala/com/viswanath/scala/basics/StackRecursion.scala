package com.viswanath.scala.basics

object StackRecursion {

  def factorial(n: Int):Int=
    if(n<=1)1
    else (n*factorial(n-1))


  def main(args: Array[String]): Unit = {
    println(factorial(4))
  }

}

/*


def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)
      result
    }



factorial(5)=5*factorial(4)
factorial(4)=4*factorial(3)
factorial(3)=3*factorial(2)
factorial(2)=2*factorial(1)
factorial(1)=1


 */
