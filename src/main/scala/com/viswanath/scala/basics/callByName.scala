package com.viswanath.scala.basics

object callByName {
  def main(args: Array[String]): Unit = {
    def infinite(): Int = 1 + infinite()
    def printFirst(x: Int, y: => Int) = println(x)
    printFirst(34, infinite())
  }

}
