
package com.viswanath.scala.example

import scala.util.{Failure, Success, Try}


object TryEx {
  def main(args: Array[String]): Unit = {



    //for loops only handles success state of try and ignores/suppress failure state of try


    //--------------------
    //for loops only handles success state of try
    //--------------------


    //--------------------

//Try to avoid try and catch block
    //--------------------


    val bool: Try[Boolean] = Try {
val b=true
     b
   }

    //case matching
bool match {
  case Success(b) => println(b)
  case Failure(b) =>
}

  val res: Try[String] =  for{
   _<- bool
    }yield "success"

    for(str<-res){
      println(s"sucessful try: $str")
    }


    //--------------------
    //for loops ignores/suppress failure state of try
    //--------------------
    val int: Try[Int] = Try {
      12/0
    }

    //case matching
    int match {
      case Success(b) => println(b)
      case Failure(b) =>
    }

    val result: Try[String] =  for{
      _<- int
    }yield "success"

    for(e<-result){
      println(s"sucessful try: $e")
    }
    println("for loop ignores/surpass failure state of try")
  }

}
