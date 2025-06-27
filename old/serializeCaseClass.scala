case class Author(login: String, id: Int, site_admin: Boolean)

implicit val authorRW: upickle.default.ReadWriter[Author] = upickle.default.macroRW

val author = upickle.default.read[Author](data(0)("author")) 

