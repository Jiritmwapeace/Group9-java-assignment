import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Triangle class extending Shape
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding the calculateArea method for Triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the calculateArea method for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the calculateArea method for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Abstract class ThreeDimensionalShape extending Shape
abstract class ThreeDimensionalShape extends Shape {
    // Abstract method to calculate volume
    public abstract double calculateVolume();
}

// Sphere class extending ThreeDimensionalShape
class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    // Overriding the calculateArea method for Sphere
    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Overriding the calculateVolume method for Sphere
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

// Cube class extending ThreeDimensionalShape
class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    // Overriding the calculateArea method for Cube
    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    // Overriding the calculateVolume method for Cube
    @Override
    public double calculateVolume() {
        return side * side * side;
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu to select a shape
        System.out.println("Select a shape:");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.println("4. Sphere");
        System.out.println("5. Cube");

        int choice = scanner.nextInt();

        // Create the selected shape based on user input
        Shape shape = null;
        switch (choice) {
            case 1:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                break;
            case 2:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 3:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                break;
            case 4:
                System.out.print("Enter radius: ");
                radius = scanner.nextDouble();
                shape = new Sphere(radius);
                break;
            case 5:
                System.out.print("Enter side: ");
                double side = scanner.nextDouble();
                shape = new Cube(side);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        // Calculate and display the area of the selected shape
        double area = shape.calculateArea();
        System.out.println("Area: " + area);

        // Check if the selected shape is a 3D shape and calculate volume if applicable
        if (shape instanceof ThreeDimensionalShape) {
            double volume = ((ThreeDimensionalShape) shape).calculateVolume();
            System.out.println("Volume: " + volume);
        }

        // Close the scanner
        scanner.close();
    }
}







