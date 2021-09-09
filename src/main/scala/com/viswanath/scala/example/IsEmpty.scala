package com.viswanath.scala.example

object IsEmpty {

  def main(args: Array[String]): Unit = {
    var s: String ="viswa"
    println(s"not empty: ${s.isEmpty}")
     s=""
    println(s" empty: ${s.isBlank}")


    val colSet=Set(List(1,2),Set(3,4))

    //collection logic
    val colSum=colSet.toList.map(col=>col.size).sum
    println(s"collection sum: $colSum")

    //foreach

    var sum=0
    colSet.foreach(col=>{
      sum=sum+(col.size)
    })
    println(s"foreach sum:$sum")

    //foldLeft
    colSet.foldLeft(0){(intValue,col)=>{
      println(s"fold left value: ${intValue+col.size}")
      intValue+col.size
    }
    }

  }
}
