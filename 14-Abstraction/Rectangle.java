public class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method
    @Override
    double calculateArea() {
        return length * width;
    }

    // Implementing abstract method
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle with length " + length + " and width " + width);
    }
}
