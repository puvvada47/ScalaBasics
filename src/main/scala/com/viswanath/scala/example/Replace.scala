package com.viswanath.scala.example

object Replace {
  def main(args: Array[String]): Unit = {

val umsatz="20.504,20"
  val output=umsatz.replaceAll(",", "\\.")
    println(output)
  }

}
