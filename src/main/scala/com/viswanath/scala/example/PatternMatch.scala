package com.viswanath.scala.example

object PatternMatch {
  def main(args: Array[String]): Unit = {

    val sourceData: Map[String, String] = Map("Vertriebskanal" -> "1", "T_Vertriebskanal" -> "2")

    val mdValue: Option[String] = sourceData.find(_._1 matches "^(?!T_).*").map(_._2)
    println(mdValue)

    val mdText: Option[String] = sourceData.find(_._1 matches "^T_.*").map(_._2)
    println(mdText)


    val dataTuple = (mdValue, mdText)

    val result: String =dataTuple match {
      //case (None, _) => "viswa"
      case (Some(md), _) if false=> "viswanath"
      //case (_, None) => "viswa"
      case (_, Some(mdt)) => mdt
    }
    println("match: "+result)
  }

}