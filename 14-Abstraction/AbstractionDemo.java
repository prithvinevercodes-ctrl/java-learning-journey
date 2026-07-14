public class AbstractionDemo {
    public static void main(String[] args) {
        // Shape abstraction example
        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(8, 5);

        System.out.println("=== Shape Example ===");
        s1.showColor();
        s1.draw();
        System.out.println("Area: " + s1.calculateArea());

        System.out.println();

        s2.showColor();
        s2.draw();
        System.out.println("Area: " + s2.calculateArea());

        System.out.println("
=== Vehicle Example ===");

        // Vehicle abstraction example
        Vehicle v1 = new Car("Hyundai");
        Vehicle v2 = new Bike("Honda");

        v1.showBrand();
        v1.start();
        v1.fuelType();

        System.out.println();

        v2.showBrand();
        v2.start();
        v2.fuelType();

        System.out.println("
=== Employee Example ===");

        // Employee abstraction example
        Employee e1 = new Developer("Sarthak", 101, 45000, 5000);

        e1.showEmployeeDetails();
        e1.workRole();
        System.out.println("Total Salary: " + e1.calculateSalary());
    }
}
