public class InheritanceDemo {
    public static void main(String[] args) {
        // Dog object
        Dog d1 = new Dog("Tommy", 3, "Labrador");
        System.out.println("Dog Details:");
        d1.displayDogDetails();
        d1.eat();     // inherited from Animal
        d1.sleep();   // inherited from Animal
        d1.bark();    // Dog-specific method

        System.out.println();

        // Cat object
        Cat c1 = new Cat("Kitty", 2, "White");
        System.out.println("Cat Details:");
        c1.displayCatDetails();
        c1.eat();     // inherited from Animal
        c1.sleep();   // inherited from Animal
        c1.meow();    // Cat-specific method

        System.out.println();

        // Car object
        Car car1 = new Car("Hyundai", 2022, "i20");
        System.out.println("Car Details:");
        car1.displayCarDetails();
        car1.start(); // inherited from Vehicle
        car1.drive(); // Car-specific method

        System.out.println();

        // Student object
        Student s1 = new Student("Aman", 19, 101, "BCA");
        System.out.println("Student Details:");
        s1.displayStudentDetails();
        s1.study();   // Student-specific method

        System.out.println();

        // Employee object
        Employee e1 = new Employee("Rahul", 28, 201, 35000);
        System.out.println("Employee Details:");
        e1.displayEmployeeDetails();
        e1.work();    // Employee-specific method

        System.out.println();

        // Manager object
        Manager m1 = new Manager("Priya", 35, 301, 60000, "HR");
        System.out.println("Manager Details:");
        m1.displayManagerDetails();
        m1.work();        // inherited from Employee
        m1.manageTeam();  // Manager-specific method
    }
}
