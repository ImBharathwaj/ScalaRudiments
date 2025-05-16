

final class countChar$_ {
def args = countChar_sc.args$
def scriptPath = """countChar.sc"""
/*<script>*/
import scala.io.Source

if (args.length > 0) {
  for (line <- Source.fromFile(args(0)).getLines)
    print(line.length+" "+line)
}
else
  Console.err.println("Please enter filename")


/*</script>*/ /*<generated>*//*</generated>*/
}

object countChar_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new countChar$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export countChar_sc.script as `countChar`

