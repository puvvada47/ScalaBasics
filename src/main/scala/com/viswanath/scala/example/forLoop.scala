package com.viswanath.scala.example

object forLoop {
  def main(args: Array[String]): Unit = {

    for(i<-1 to 10){
      println("for loop using To: "+i )
    }

    for(j<- 1 until 10){
      println(s"for loop using until : $j")
    }

    val numList = List(1,2,3,4,5,6,7,8,9,10);

    val index0InList=numList.apply(0)
    val index1InList=numList(1)

    println(s"index 0 and 1 in list: $index0InList and $index1InList")

    // for loop execution with a yield
    var resultYieldList: List[Int] = for{num <- numList if num != 3; if num < 8}yield num
    println(s"for loop using Yield: $resultYieldList")

    }
  }


