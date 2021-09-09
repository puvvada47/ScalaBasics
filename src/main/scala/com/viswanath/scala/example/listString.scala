package com.viswanath.scala.example

import java.util
import scala.collection.JavaConverters._


object listString {
  def main(args: Array[String]): Unit = {
   val array: String =List(1,2,3).toString()
    println("array: "+array)
    val list: util.List[String] =util.Arrays.asList(array)



    println(s"list: $list")



  }

}
