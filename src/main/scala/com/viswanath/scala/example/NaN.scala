package com.viswanath.scala.example

object NaN {
  def main(args: Array[String]): Unit = {
    println(Seq(1.0,Double.NaN,1.1).max)
    println(Seq(1.0,1.1,Double.NaN).max)
  }

}
