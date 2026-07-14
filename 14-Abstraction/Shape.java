public abstract class Shape {
    // Common property for all shapes
    String color = "Blue";

    // Normal method
    void showColor() {
        System.out.println("Shape color: " + color);
    }

    // Abstract method - child classes must define it
    abstract double calculateArea();

    // Another abstract method
    abstract void draw();
}
