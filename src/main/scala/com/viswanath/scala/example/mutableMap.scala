package com.viswanath.scala.example

import scala.collection.mutable

object mutableMap {
  def main(args: Array[String]): Unit = {
    var map: mutable.Map[String, String] =mutable.Map[String, String]()
    for(i<-1 to 10) {
      map+=((i.toString,"all"))
      map.put(i.toString,"writing dstream to Kafka")
      map+=i.toString->"writing dstream to Kafka"
    }
    println("map: "+map)
    println("flag: "+map.isInstanceOf[mutable.Map[String, String]])

    println(map("11"))
  }
}
