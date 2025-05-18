case class Person(name: String, age: Int)

def describe(x: Any): String = x match {
  case 1 => "One"
  case "Hello" => "A Greeting"
  case Person(name, age) => s"Person: $name, Age: $age"
  case _ => "Other"
}

println(describe(1))
println(describe("Hello"))
println(describe(Person("Dhana", 26)))
println(describe(42))

