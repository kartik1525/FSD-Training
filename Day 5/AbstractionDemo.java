
public class AbstractionDemo {
    
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
abstract class Shape {
    abstract double area();
    void display() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    void display() {
        System.out.println("This is a circle.");
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
    void display() {
        System.out.println("This is a rectangle.");
    }
}