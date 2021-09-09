package com.viswanath.scala.example

object ScalaLoops {
  def main(args: Array[String]): Unit = {


    println("1way")
    //1 way
    for{

      i<-1 to 5
      j<-1 to 3
      k<-1 to 2
    }
    println(s"i=$i,j=$j,k=$k")



    //2 way(easy way in represenation)
    println("2way")
    for(i<-1 to 5;j<-1 to 3;k<-1 to 2){
      println(s"i=$i,j=$j,k=$k")
    }

    //3way
    println("3way")
    for(i<-1 to 5){
      for(j<-1 to 3){
        for(k<-1 to 5){
          println(s"i=$i,j=$j,k=$k")
        }
      }
    }
  }

}



/* for {
     i <- 1 to 3
     j <- 1 to 5
     k <- 1 to 10
   } println(s"i = $i, j = $j, k = $k")*/