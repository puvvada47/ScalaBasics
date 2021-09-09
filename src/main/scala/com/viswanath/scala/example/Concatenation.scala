package com.viswanath.scala.example

object Concatenation {
  def main(args: Array[String]): Unit = {
    val s1="Puvvada"
    val s2="Viswanath"
    val s3=s"${s1}.${s2}"
    println(s3)
  }

}
