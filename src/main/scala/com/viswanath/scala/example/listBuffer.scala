package com.viswanath.scala.example

import scala.collection.mutable.ListBuffer

object listBuffer {
  def main(args: Array[String]): Unit = {
    var listbuffer: ListBuffer[String] = new ListBuffer[String]()
    listbuffer += "a"
    listbuffer += "b"
    println(s"listBuffer:$listbuffer")
    println(s"list:${listbuffer.toList}")



   /*
  var seq: Seq[String] = Seq("b", "c")
   println(listbuffer.toSeq.asInstanceOf[Seq[String]])
 val input: Seq[Range.Inclusive] = Seq(1 to 4, 5 to 8, 9 to 12)
    println(input)*/
  }
}
