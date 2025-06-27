class Person(name: String, age: Int){
//  private val id = Person.nextId()

  def greet(): Unit = {
    println(s"Hello, my name is $name and I am $age years old.")
  }
}

val person1 = new Person("Alice", 24)
person1.greet()
