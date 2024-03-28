import java.util.Scanner;

abstract class Shape {
    double base;
    double height;
    double area;
    double perimeter;

    public Shape(double base, double height) {
        this.base = base;
        this.height = height;
    }

    abstract public void area();

    abstract public void perimeter();

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

}

class Rectangle extends Shape {
    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    public void area() {
        area = base * height;
    }

    public void perimeter() {
        perimeter = 2 * (base * height);
    }

}

class Square extends Shape {
    public Square(double length) {
        super(length, length);
    }

    public void area() {
        area = (base * height);
    }

    public void perimeter() {
        perimeter = 4 * base;
    }

}

class Circle extends Shape {
    public Circle(double radius) {
        super(radius, radius);
    }

    public void area() {
        area = Math.PI * base * height;
    }

    public void perimeter() {
        perimeter = 2 * (base * Math.PI);
    }
}

public class ShapeOverload {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and breadth of the Rectangle");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println("Enter the side of the Square");
        double side = sc.nextDouble();
        System.out.println("Enter the radius of the Circle");
        double radius = sc.nextDouble();
        Shape shape1 = new Rectangle(length, breadth);
        shape1.area();
        shape1.perimeter();
        System.out.println("Area of the Rectangle is " + shape1.getArea());
        System.out.println("Perimeter of the Rectangle is " + shape1.getPerimeter());
        shape1 = new Square(side);
        shape1.area();
        shape1.perimeter();
        System.out.println("Area of the Square is " + shape1.getArea());
        System.out.println("Perimeter of the Square is " + shape1.getPerimeter());
        shape1 = new Circle(radius);
        shape1.area();
        shape1.perimeter();
        System.out.println("Area of the Circle is " + shape1.getArea());
        System.out.println("Perimeter of the Circle is " + shape1.getPerimeter());
    }
}
