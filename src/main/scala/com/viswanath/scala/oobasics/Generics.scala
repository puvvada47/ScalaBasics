package com.viswanath.scala.oobasics

object Generics {

  //COVARIANCE
  class MyList[+A] {
    // use the type A =>(B is superType, A is subType)
    def add[B >: A](element: B): MyList[B] = ???
    /*
      A = Cat
      B = if(Dog=>Animal) then Animal
     */
  }

  class MyMap[Key, Value]



  object MyList {
    def empty[A]: MyList[A] = ???
  }

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes, List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A] extends MyList[A]

  // 2. NO = INVARIANCE
  class InvariantList[A]

  // 3. Hell, no! CONTRAVARIANCE
  class Trainer[-A]

  // bounded types(A is subType)
  class Cage[A <: Animal](animal: A)
  class Car


  def main(args: Array[String]): Unit = {

    val listOfIntegers = new MyList[Int]
    val listOfStrings = new MyList[String]


    val animal: Animal = new Cat
    //COVARIANCE(superType=subtype)
    val animalList: CovariantList[Animal] = new CovariantList[Cat]
    animalList.add(new Dog) //??? HARD QUESTION => we return a list of Animals

    //INVARIANCE(sametype=sametype)
    val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

    //CONTRAVARIANCE(subtype=supertype
    val trainer: Trainer[Cat] = new Trainer[Animal]

    // bounded types
    val cage = new Cage(new Dog)

    // generic type needs proper bounded type
    // val newCage = new Cage(new Car)(we should not use)(since car is not belongs to Animal)

  }

}
