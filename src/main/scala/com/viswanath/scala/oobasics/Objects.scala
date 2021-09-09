package com.viswanath.scala.oobasics

object Objects {


  //singleton object=>only one instance
  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2

    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }



  class Person(val name: String) {
    // instance-level functionality
  }

  // COMPANIONS(class name and object name will be same)
  //class defines instance related functionality
  //object defines static level changes(class level changes as java)


  def main(args: Array[String]): Unit = {


    println(Person.N_EYES)
    println(Person.canFly)

    // Companion instance
    val mary = new Person("Mary")
    val john = new Person("John")
    println(mary == john)

    // Scala object = SINGLETON INSTANCE
    val person1 = Person
    val person2 = Person
    println(person1 == person2)

    val bobbie = Person(mary, john)
    val boby=Person.apply(mary,john)
    // Scala Applications = Scala object with
    // def main(args: Array[String]): Unit
  }
}

/*take aways
* 1)singleton Object=>single instance=>defines class level definitions or static in Java
* 2)Companion(class and object will have same name)
* class will have instance functionality
* object will have static/class level functionality
*
*
*
*
* */
