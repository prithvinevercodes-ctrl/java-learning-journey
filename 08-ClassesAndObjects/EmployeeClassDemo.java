public class Employee {
    int empId;
    String name;
    double basicSalary;
    double bonus;

    double calculateSalary() {
        return basicSalary + bonus;
    }

    void displayDetails() {
        System.out.println("Employee Details");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
