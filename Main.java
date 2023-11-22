package OOP;

// Step 1: Abstract Base Class BasicShape
abstract class BasicShape {
    protected double area;

    public double getArea() {
        return area;
    }

    // Abstract method
    public abstract void calcArea();
}

// Step 2: Circle Class
class Circle extends BasicShape {
    private long radius;

    // Constructor
    public Circle(long centerX, long centerY, long radius) {
        this.radius = radius;
        calcArea();
    }

    // Override calcArea
    @Override
    public void calcArea() {
        // Area of circle = π * radius * radius
        super.area = 3.14159 * radius * radius;
    }
}

// Step 3: Rectangle Class
class Rectangle extends BasicShape {
    private double width, length;

    // Parameterized Constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        calcArea();
    }

    // Override calcArea
    @Override
    public void calcArea() {
        // Area of rectangle = length * width
        super.area = length * width;
    }
}

// Step 4: Main Class
public class Main {
    public static void main(String[] args) {
        // Step 5: Demonstrate the classes
        Circle circle = new Circle(0, 0, 5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Output the areas
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}
