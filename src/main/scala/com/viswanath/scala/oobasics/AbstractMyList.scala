package com.viswanath.scala.oobasics

abstract class AbstractMyList{

  def head:Int
  def tail:AbstractMyList
  def isEmpty:Boolean
  def add(elements:Int):AbstractMyList
  def printElements:String
  override def toString:String="["+printElements+"]"
}


object Emp extends AbstractMyList{
  override def head = throw new NoSuchElementException
  override def tail =throw new NoSuchElementException
  override def isEmpty: Boolean = true
  override def add(element:Int)= new Conse(element,Emp)
  override def printElements: String = ""
}

class Conse(h:Int, t:AbstractMyList) extends AbstractMyList{
  override def head: Int = h
  override def tail: AbstractMyList = t
  override def isEmpty: Boolean = false
  override def add(element:  Int): AbstractMyList = new Conse(element,this)
  override def printElements: String =
    if(t.isEmpty) ""+h
    else h+" "+t.printElements
}

object AbstractMyListIntegertest{
  def main(args: Array[String]): Unit = {
    val list: Conse =new Conse(1,new Conse(2,new Conse(3,Emp)))
    val p: AbstractMyList =list.tail
    println(p)
    println(p.tail)
    println(p.head)
    println(list.tail.head)
  }
}
