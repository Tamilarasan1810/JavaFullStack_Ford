package Assignment_Day2.AbstractAreaCalculation;

abstract class Shape
{
    String name;
    String color;
    public  Shape(String name,String color)
    {
        this.name =name;
        this.color = color;
    }
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shape
{
    int radius;
    public Circle(String name,String color,int radius)
    {
        super(name,color);
        this.radius = radius;
    }
    public double calculateArea(){

        return (3.14*(this.radius*this.radius));
    }
    public double calculatePerimeter()
    {
        return (2*3.14*this.radius);
    }
}
class Square extends Shape
{
    int length;
    public Square(String name,String color,int length)
    {
        super(name,color);
        this.length = length;
    }
    public double calculateArea()
    {
        return (this.length*this.length);
    }
    public double calculatePerimeter()
    {
        return (4*this.length);
    }
}
public class CalculateArea {
    public static void main(String[] args) {
        Circle cir = new Circle("circle","Red",7);
        System.out.println("Area: "+cir.calculateArea());
        System.out.println("Perimeter: "+cir.calculatePerimeter());
        Square sqr = new Square("Square","Blue",5);
        System.out.println("Area: "+sqr.calculateArea());
        System.out.println("Perimeter: "+sqr.calculatePerimeter());
    }
}
