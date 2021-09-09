package com.viswanath.scala.basics

import scala.annotation.tailrec

object TailRecursion {

  def factorial(n: Int): BigInt = {
    @tailrec
    def fact(n: Int, tmp: BigInt): BigInt = {
      if (n <= 1) tmp
      else fact(n - 1, n * tmp)  // TAIL RECURSION = use recursive call as the LAST expression
    }

    fact(n, 1)

  }

  def main(args: Array[String]): Unit = {
    println(factorial(50000))
  }

}


/*
factorial(5)=fact(5,1)
            =fact(4,5*1)
            =fact(3,4*5*1)
            =fact(2,3*4*5*1)
            =fact(1,1*2*3*4*5)
            =1*2*3*4*5


           The tail recursive functions better than non tail recursive functions
           (Stack Overflow Function)
            because tail-recursion can be optimized by compiler.

            A recursive function is said to be tail recursive
            if the recursive call is the last thing done by the function.

            There is no need to keep record of the previous state

            Scala’s tail recursion optimizations can address this issue
            by reducing the call stack to just one frame since we didnot need to preserve
            the previous state.


 */
