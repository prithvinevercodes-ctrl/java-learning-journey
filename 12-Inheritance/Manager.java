public class Manager extends Employee {
    // Manager-specific property
    String department;

    // Constructor
    Manager(String name, int age, int empId, double salary, String department) {
        super(name, age, empId, salary); // calling Employee constructor
        this.department = department;
    }

    // Manager-specific behavior
    void manageTeam() {
        System.out.println(name + " is managing the " + department + " department.");
    }

    void displayManagerDetails() {
        displayEmployeeDetails(); // inherited from Employee
        System.out.println("Department: " + department);
    }
}
