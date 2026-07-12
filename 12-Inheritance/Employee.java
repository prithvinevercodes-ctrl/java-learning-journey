public class Employee extends Person {
    // Employee-specific properties
    int empId;
    double salary;

    // Constructor
    Employee(String name, int age, int empId, double salary) {
        super(name, age); // parent constructor
        this.empId = empId;
        this.salary = salary;
    }

    // Employee-specific method
    void work() {
        System.out.println(name + " is working.");
    }

    void displayEmployeeDetails() {
        displayPersonDetails(); // inherited method
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}
