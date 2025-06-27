case class Person(name: String, age: Int)

val person = Person("Alice", 30)

person match {
  case Person(name, age) => println(s"Name: $name, Age: $age")
  case null => println("Not a person")
}
