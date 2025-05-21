val numbers = upickle.default.read[Seq[Int]]("[1,2,3,4]")

println(upickle.default.write(numbers))

val tuples = upickle.default.read[Seq[(Int, Boolean)]]("[[1, true], [2, true]]")

println(upickle.default.write(tuples))

val input = """{"weasel": ["i", "am"], "baboon": ["i", "r"]}"""

val parsed = upickle.default.read[Map[String, Seq[String]]](input)

println(upickle.default.write(parsed))

