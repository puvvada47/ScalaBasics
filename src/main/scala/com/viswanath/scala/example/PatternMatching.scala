package com.viswanath.scala.example
import scala.util.matching.Regex

object PatternMatching {

  def main(args: Array[String]) {
      val pattern = new Regex("abl[ae]\\d+")
      val str = "ablaw is able1 and cool"
    println((pattern findAllIn str).mkString(","))

    val pattern1 = new Regex("res?")
    val str1 = "reult is my result and ur reult"
    println((pattern1 findAllIn str1).mkString(","))

    val pattern2 = new Regex("res+")
    val str2 = "result is my result and ur result"
    println((pattern2 findAllIn str2).mkString(","))

  val pattern3 = new Regex("res*")
  val str3 = "result is my result and ur result"
    println((pattern3 findAllIn str3).mkString(","))


    val pattern4 = new Regex("""^([0-9]{5})""")
    val str4 = "246856"
    println((pattern4 findAllIn str4).mkString(","))

    val pattern5 = new Regex("^[0-9]{1}.*")
    val str5= "2345678viswa060891"
    println((pattern5 findAllIn str5).mkString(","))

    val pattern6 = new Regex("""^[\d]+$""")
    val str6= "23456789"
    println((pattern6 findAllIn str6).mkString(","))

    //rereplaceFirst("^0+(?!$)", "")


    val str7= "000000000000000567123viswanath1230"
    println((str7.replaceFirst("^0+(?!$)", "")).mkString(","))




  }
}







