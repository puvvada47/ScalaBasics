package com.viswanath.scala.example

object Function {
  def main(args: Array[String]): Unit = {

    val a = 1
    val b = 2

    def func(i: Int): String = i match {
      case a => "one"
      case b => "two"
    }

    func(1)
    func(2)

  }
}
