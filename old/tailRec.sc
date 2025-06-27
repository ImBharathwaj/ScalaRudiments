import scala.annotation.tailrec

def factorial(n: Int): BigInt = {
  @tailrec
  def factorialHelper(n: Int, accumulator: BigInt): BigInt = {
    if (n <= 1) accumulator
    else factorialHelper(n-1, n*accumulator)
  }
  factorialHelper(n,1)
}
