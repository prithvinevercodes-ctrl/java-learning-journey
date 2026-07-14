public class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method
    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }

    // Implementing abstract method
    @Override
    void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }
}
