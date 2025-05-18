class Animal {
  def speak(): Unit = {
    println("Animal Speaks")
  }
}

class Dog extends Animal {
  override def speak(): Unit = {
  println("Dog barks")
  }
}

val dog = new Dog()
dog.speak()
