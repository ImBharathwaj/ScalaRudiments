abstract class Shape{
  def area: Double
  def perimeter: Double
}

class Circle(radius: Double) extends Shape {
  def area: Double = math.Pi*radius*radius
  def perimete: Double = 2 * math.Pi * radius
}

