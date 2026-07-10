public class AreaCalculator {

    double calculateArea(int side) {
        return side * side;
    }

    double calculateArea(int length, int breadth) {
        return length * breadth;
    }

    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        System.out.println("Area of square: " + obj.calculateArea(4));
        System.out.println("Area of rectangle: " + obj.calculateArea(5, 6));
        System.out.println("Area of circle: " + obj.calculateArea(3.5));
    }
}
