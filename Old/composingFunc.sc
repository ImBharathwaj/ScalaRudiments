numbers = List(1,2,3,4,5)

val squareOfSumOfEvens = numbers
  .filter(x => x%2 == 0)
  .map(x => x * x)
  .reduce((x, y) => x+y)

