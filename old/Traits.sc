trait Speaker{
  def speak(): Unit
}

class Animal extends Speaker {
  def speak(): Unit = {
    println("Animal Speaks")
  }
}

class Dog extends Speaker {
  def speak(): Unit = {
    println("Dog barks")
  }
}

val dog = new Dog()
dog.speak()
