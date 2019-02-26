import scala.math._ 

trait Shape {
    def area :Double
}

object Shape {
    private class Circle(radius: Double) extends Shape{
        override val area = 3.14*radius*radius
    }

    private class Rectangle(height: Double, length: Double) extends Shape{
        override val area = height * length
    }

    private class Triangle(a: Double, b: Double, c: Double) extends Shape{
        override val area = 0.25 * math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a))
    }
    def apply(height :Double , length :Double ) : Shape = new Rectangle(height,length)
    def apply(radius :Double) : Shape = new Circle(radius)
    def apply(a: Double, b: Double, c: Double) : Shape = new Triangle(a,b,c)
}

object Main{
    def main(args: Array[String]){
        val circle = Shape(2)
        println("Circle Area:" + circle.area)
        val rectangle = Shape(2,3)
        println("Rectange Area:" + rectangle.area)
        val triangle = Shape(4,5,3)
        println("Triagnle Area:" + triangle.area)
    }
}
