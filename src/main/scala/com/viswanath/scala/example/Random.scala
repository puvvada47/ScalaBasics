package com.viswanath.scala.example

import scala.util.Random

object Random {
  def main(args: Array[String]): Unit = {

    val r: Random= new scala.util.Random(System.currentTimeMillis())
    println(r.nextInt())
    val k=r.nextInt(100000000)
    println(k)
  }

}
