class Animal(name: String){
  def speak(): Unit = {
    println(s"$name speaks")
  }
}

class Dog(name: String) extends Animal(name){
  override def speak(): Unit = {
    super.speak()
    println("Dog Barks")
  }
}

val dog = new Dog("Dhanasekar")
dog.speak()
