public class AreaCalculator {

    static double areaOfCircle(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }

    static double areaOfRectangle(double length, double width) {
        double area = length * width;
        return area;
    }

    static double areaOfSquare(double side) {
        double area = side * side;
        return area;
    }

    public static void main(String[] args) {
        System.out.println("Area Calculator Using Methods");

        double circleArea = areaOfCircle(5);
        double rectangleArea = areaOfRectangle(4, 6);
        double squareArea = areaOfSquare(3);

        System.out.println("Area of Circle (r = 5): " + circleArea);
        System.out.println("Area of Rectangle (4 x 6): " + rectangleArea);
        System.out.println("Area of Square (side = 3): " + squareArea);
    }
}
