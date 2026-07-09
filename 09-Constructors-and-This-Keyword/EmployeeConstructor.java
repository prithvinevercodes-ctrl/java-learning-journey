public class EmployeeConstructor {
    int empId;
    String name;
    double basicSalary;
    double bonus;

    EmployeeConstructor(int empId, String name, double basicSalary, double bonus) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

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

    public static void main(String[] args) {
        EmployeeConstructor e1 = new EmployeeConstructor(201, "Rahul", 25000, 5000);
        e1.displayDetails();
    }
}
