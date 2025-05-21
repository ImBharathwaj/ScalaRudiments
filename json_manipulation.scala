val jsonString = os.read(os.pwd/"ammonite-releases.json")

val data = ujson.read(jsonString)

val small = ujson.Arr(
  ujson.Obj("Hello" -> ujson.String("world"), "answer" -> ujson.Num(42)),
  ujson.Boolean(true)
)

val small = ujson.Arr(
  ujson.Obj("Hello" -> "world", "answer" -> 42),
  true
)

println(ujson.write(small))
os.write(os.pwd/"out.json", small)

os.read(os.pwd /"out.json")

println(data(0))
println(data(0)("url"))
println(data(0)("author")("id"))
println(small)
println(small(0)("hello") = "goodbye")
small(0)("tags") = ujson.Arr("awesome", "yay", "wonderful")
println(small)
