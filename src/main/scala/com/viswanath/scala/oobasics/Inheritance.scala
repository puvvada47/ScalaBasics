package com.viswanath.scala.oobasics

object Inheritance {


  // single class inheritance
  sealed class Animal {
    val creatureType = "wild"

    def eat = println("nomnom")
  }

  //inheritance
  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }


  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)


  // overriding and Super(refers to parent class)
  class Dog(override val creatureType: String) extends Animal {
    //    override val creatureType = "domestic"
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // preventing overrides
  // 1 - use final on member to prevent overriding
  // 2 - use final on the entire class to prevent inheritance
  // 3 - seal the class => extend classes in THIS FILE, prevent extension in other files

  def main(args: Array[String]): Unit = {

    val cat = new Cat
    cat.crunch

    val dog = new Dog("K9")
    dog.eat
    println(dog.creatureType)
  }
}
/*
//take aways

1)inheritance(parent and child class)
2)constructors(parent and child class will have constructors)
3)Override(same method will override in child class)
4)Super(refer to parent class)
5)sealed(will prevent extends classes in other files)
6)final(it will stop override and inheritance
7)substitution or polymorpism
*/
