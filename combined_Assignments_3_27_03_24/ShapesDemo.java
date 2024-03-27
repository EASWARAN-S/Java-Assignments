import java.util.Scanner;

abstract class Shape {
    double base;
    double height;
    double area;

    public Shape(double base, double height) {
        this.base = base;
        this.height = height;
    }

    abstract public void area();

    public double getArea() {
        return area;
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    public void area() {
        area = base * height;
    }

}

class Triangle extends Shape {
    public Triangle(double length, double breadth) {
        super(length, breadth);
    }

    public void area() {
        area = (base * height) / 2;
    }

}

class Circle extends Shape {
    public Circle(double radius) {
        super(radius, radius);
    }

    public void area() {
        area = Math.PI * base * height;
    }

}

public class ShapesDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and breadth of the Rectangle");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println("Enter the base and height of the Triangle");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Enter the radius of the Circle");
        double radius = sc.nextDouble();
        Shape shape1 = new Rectangle(length, breadth);
        shape1.area();
        System.out.println("Area of the Rectangle is " + shape1.getArea());
        shape1 = new Triangle(base, height);
        shape1.area();
        System.out.println("Area of the Triangle is " + shape1.getArea());
        shape1 = new Circle(radius);
        shape1.area();
        System.out.println("Area of the Circle is " + shape1.getArea());

    }

}