package com.viswanath.scala.basics

object DefaultAndNamedArg {
  def main(args: Array[String]): Unit = {

    def fact(n: Int, tmp: Int = 1): Int =
      if (n <= 1) tmp
      else fact(n-1, n*tmp)

    val factValue=fact(5)//since tmp is already defaulted
    println(s"factorial value: $factValue")

    def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
    savePicture(width = 800)
    savePicture("bfb")

    /*
      1. pass in every leading argument
      2. name the arguments. in this case order need not to be maintained
     */

    savePicture(height = 600, width = 800, format = "bmp")


  }

}
