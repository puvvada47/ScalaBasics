package com.viswanath.scala.example

object Recursion {

  def main(args: Array[String]): Unit = {


    def fac(n:Int): Int ={

      if(n==1)1
      else
        {
          val r=n*fac(n-1)
          n
        }
    }
  }

}
