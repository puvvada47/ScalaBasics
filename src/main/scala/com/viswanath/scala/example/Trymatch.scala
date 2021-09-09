package com.viswanath.scala.example

import scala.util.Try

object Trymatch {
  def main(args: Array[String]): Unit = {
    val number=20
    val num=10

    val result =Try(number/0 match {case 10 =>"10" case _=>None}).getOrElse("unknown")
    val res1 =Try(number match {case 10 =>"10" case _=>None}).getOrElse("unknown")
    val res2 =Try(num match {case 10 =>"10" case _=>None}).getOrElse("unknown")

    println(result)
    println(res1)
    println(res2)
  }

}
