package company;

public class Employee {
    // Protected members
    protected int id;
    protected String name;

    // Public constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Protected method
    protected void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}
