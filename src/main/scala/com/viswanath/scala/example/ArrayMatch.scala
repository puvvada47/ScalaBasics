package com.viswanath.scala.example

object ArrayMatch {

  def main(args: Array[String]): Unit = {
    val array: Array[(String, String)] =Array(("mdUsed","P"),("btUsed","P"))

    val tktStatus=array.toMap
    println(tktStatus)


    tktStatus match {

      case status if tktStatus.contains("mdNew") && tktStatus.contains("btNew") && status("mdNew").toLowerCase.equals("p") && status("btNew").toLowerCase.equals("p") =>println(s"created")

      case status if tktStatus.contains("mdSmart") && tktStatus.contains("btSmart") && status("mdSmart").toLowerCase.equals("p") && status("btSmart").toLowerCase.equals("p")=> println(s"created")

      case status if tktStatus.contains("mdUsed") && tktStatus.contains("btUsed") && status("mdUsed").toLowerCase.equals("p") && status("btUsed").toLowerCase.equals("p") => println(s"trigger going to create") ;println(s"created")

      case status if tktStatus.contains("mdNewUltimo") && tktStatus.contains("btNewUltimo") && status("mdNewUltimo").toLowerCase.equals("p") && status("btNewUltimo").toLowerCase.equals("p") => println(s"created")

      case status if tktStatus.contains("mdSmartUltimo") && tktStatus.contains("btSmartUltimo") && status("mdSmartUltimo").toLowerCase.equals("p") && status("btSmartUltimo").toLowerCase.equals("p") => println(s"created")

      case status if tktStatus.contains("mdUsedUltimo") && tktStatus.contains("mdUsedUltimo") && status("mdUsedUltimo").toLowerCase.equals("p") && status("mdUsedUltimo").toLowerCase.equals("p") => println(s"created")

      case _ => println("unable to create the zero byte HDFS trigger file")

    }

    }


}
