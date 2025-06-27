import scala.io.Source

def countChar(): String {
  if (args.length > 0) {
    for (line <- Source.fromFile(args(0)).getLines)
      print(line.length+" "+line)
  }
  else
    Console.err.println("Please enter filename")
}

def widthOfLengths(s: String) = s.length.toString.length
