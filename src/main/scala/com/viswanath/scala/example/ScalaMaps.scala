package com.viswanath.scala.example

object  ScalaMaps {

  def main(args: Array[String]): Unit = {

    val dataList: List[Int] = List(1, 2, 3, 4)

    def addition(a: Int) = a + 1 //f(x)
    val b = 2


    //1 way
    val mapDataList: List[Int] = dataList.map(addition)
    println("map data list 1stway: " + mapDataList)

    //2 way
    val mapDataList1: List[Int] = dataList.map(number => addition(number))
    println("map data list 2nd way: " + mapDataList1)

    //3way
    val mapDataList3: List[Int] = dataList.map(addition(_))
    println("map data listin 3 way: " + mapDataList3)

    //4 way
    val f: (Int => Int) =new Function1[Int,Int] {
     def apply(a: Int): Int ={
       a + 1
     }
   }
    //or
    /*val f: (Int => Int) = a => a + 1
    */
    val mapDataList4: List[Int] =dataList.map(f)
    println("map data listin 4 way: " + mapDataList4)

    //5 way

    class anomyous extends Function1[Int, Int] {
      override def apply(a: Int): Int = a + 1
    }
    val fu: anomyous =new anomyous
    val mapDataList5: List[Int] =dataList.map(fu)
    println("map data listin 5 way: " + mapDataList5)

//6 way

    class anomyouss extends (Int=>Int) {
      override def apply(a: Int): Int = a + 1
    }
    val fun: anomyouss =new anomyouss
    val mapDataList6: List[Int] =dataList.map(fun)
    println("map data listin 6 way: " + mapDataList6)


    //7 way

    class anomy extends (Int=>Int) {
      override def apply(a: Int): Int = a + 1
    }
    val func: (Int=>Int) =new anomy
    val mapDataList7: List[Int] =dataList.map(func)
    println("map data listin 7 way: " + mapDataList7)



  }


}
