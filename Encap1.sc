class Person(private var _name: String, private var _age: Int){
  def name: String = _name
  def name_: (newName: String): Unit = _name = newName

  def age: Int = _age
  def age_=(newAge: Int): Unit = _age = newAge
}

// def main(): Unit = { 
  val person = Person("Alice", 30)
  // person.name = "Bob"
  // person.age = 25
  println(s"Name: ${person.name}, Age: ${person.age}")
// }
