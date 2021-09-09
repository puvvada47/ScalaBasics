package com.viswanath.scala.oobasics

abstract class AbstractMyListGeneric[+A] {

  def head:A
  def tail:AbstractMyListGeneric[A]
  def isEmpty:Boolean
  def add[B >: A](elements:B):AbstractMyListGeneric[B]
  def printElements:String
  override def toString:String="["+printElements+"]"
}


object Empty extends AbstractMyListGeneric[Nothing]{
  override def head:Nothing = throw new NoSuchElementException
  override def tail:AbstractMyListGeneric[Nothing] =throw new NoSuchElementException
  override def isEmpty: Boolean = true
  override def add[B >: Nothing](element:B): AbstractMyListGeneric[B] = new Cons(element,Empty)
  override def printElements: String = ""
}

class Cons[+A](h:A, t:AbstractMyListGeneric[A]) extends AbstractMyListGeneric[A]{
  override def head: A = h
  override def tail: AbstractMyListGeneric[A] = t
  override def isEmpty: Boolean = false
  override def add[B >: A](element:  B): AbstractMyListGeneric[B] = new Cons(element,this)
  override def printElements: String =
    if(t.isEmpty) ""+h
    else h+" "+t.printElements
}

object GenericList{
  def main(args: Array[String]): Unit = {
    val listOfIntegers: Cons[Int] =new Cons(1,new Cons(2,new Cons(3,Empty)))
    val listOfStrings: Cons[String] =new Cons("Puvvada",new Cons("kali",new Cons("Viswanath",Empty)))
    //val k: AbstractMyList[Int] =list.tail
    println(listOfIntegers.toString)//to string is implemented by default
    println(listOfStrings.toString)

  }
}
