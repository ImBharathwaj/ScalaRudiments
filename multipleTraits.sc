trait Swimmer{
  def swim(): Unit
}

trait Flyer {
  def fly(): Unit
}

class Duck extends Swimmer with Flyer{
  def swim(): Unit = {
    println("Duck Swims")
  }

  def fly(): Unit = {
    println("Duck flies")
  }
}

val duck = new Duck()
duck.swim()
duck.fly()
