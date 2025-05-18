class Person(firstName: String, lastName: String){
  var fullName: String = s"$firstName $lastName"

  def greet(): Unit = {
    println(s"Hello, my name is $fullName")
  }
}

val person1 = new Person("Alice", "Smith")
println(person1.fullName)
person1.greet()
