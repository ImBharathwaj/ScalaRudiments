

final class FizzBuzz$_ {
def args = FizzBuzz_sc.args$
def scriptPath = """FizzBuzz.sc"""
/*<script>*/
for ( i <- Range.inclusive(1, 100)) {
  println(
    if (i % 3 == 0 && i % 5 == 0) "FizzBuzz"
    else if (i % 3 == 0) "Fizz"
    else if (i % 5 == 0) "Buzz"
    else i
  )
}

/*</script>*/ /*<generated>*//*</generated>*/
}

object FizzBuzz_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new FizzBuzz$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export FizzBuzz_sc.script as `FizzBuzz`

