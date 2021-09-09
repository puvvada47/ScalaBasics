package com.viswanath.scala.basics

object FibonacciTailRecursion {
  def main(args: Array[String]): Unit = {

    def fibonacci(n:Int):Int={

      def fibTailrec(i:Int,last:Int,nextToLast:Int):Int=
        if(i>n) last
        else {
          println(s"going into $i")
          fibTailrec(i+1,last+nextToLast,last)
        }

      if(n<=2)1
      else fibTailrec(2,1,0)

    }

    println(fibonacci(5))


  }

}





/*
0 1 1 2 3 5


 */