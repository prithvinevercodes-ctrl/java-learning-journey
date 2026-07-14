public class AbstractClassDemo {
    public static void main(String[] args) {
        // We cannot do this:
        // Shape s = new Shape();   // Error, because Shape is abstract

        // But we can create child class objects
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);

        System.out.println("Abstract Class Demo");
        shape1.draw();
        System.out.println("Area of Circle: " + shape1.calculateArea());

        System.out.println();

        shape2.draw();
        System.out.println("Area of Rectangle: " + shape2.calculateArea());
    }
}
