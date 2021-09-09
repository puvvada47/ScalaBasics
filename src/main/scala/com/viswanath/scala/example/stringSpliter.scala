package com.viswanath.scala.example

object stringSpliter {
  def main(args: Array[String]): Unit = {
    val d="|"
    val s="FreshOurBiiSuccessMessage|202107151209561405910|VIN_TTB1569421J484939|SA|2019-07-05"
    val array=s.split("\\|")
    println(s"array elements: ${array(0)} ${array(1)} ${array(2)}")
  }

}
