val numbers = List[Int](1,2,3,4,5)

val dividedByTwo: PartialFunction[Int, Int] = {
  case x if x % 2 == 0 => x/2
}

val result = numbers.collect(dividedByTwo)
println(result)
