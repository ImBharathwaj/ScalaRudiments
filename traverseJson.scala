import upickle.default._

def traverse(v: ujson.Value): Iterable[String] = v match {
  case a: ujson.Arr => a.arr.map(traverse).flatten
  case o: ujson.Obj => o.obj.values.map(traverse).flatten
  case s: ujson.Str => Seq(s.str)
  case _: Nil
  } 
