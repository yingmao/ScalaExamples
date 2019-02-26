

public class ObjectSample{

    private static class Shape{
        protected double area;
        public double getArea(){
            return area;
        }
    }

    private static class Circle extends Shape{
        public Circle(double radius){
            area = 3.14*radius*radius; 
        }
    }

    private static class Rectangle extends Shape{
        public Rectangle(double width,double height){
            area = width * height;
        }
    }

    private static class Triangle extends Shape{
        public Triangle(double a,double b,double c){
            area =  0.25 * Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a));
        }
    }

    public static void main(String[] args){
        Shape circle = new Circle(2);
        Shape rectangle = new Rectangle(3,4);
        Shape triangle = new Triangle(3,4,5);
        System.out.println("Circle area:" + circle.getArea());
        System.out.println("Rectangle area:" + rectangle.getArea());
        System.out.println("Triangle area:" + triangle.getArea());
    }

}
