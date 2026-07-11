public class Employee {
    // Private fields
    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        setName(name);
        setSalary(salary);
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    // Setter for employee name
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid employee name. Setting default name.");
            this.name = "No Name";
        }
    }

    public double getSalary() {
        return salary;
    }

    // Setter for salary with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative. Setting salary to 0.");
            this.salary = 0;
        }
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(201, "Rahul", 35000);
        Employee e2 = new Employee(202, "", -5000);

        System.out.println("Employee 1 Details:");
        e1.displayDetails();

        System.out.println("
Employee 2 Details:");
        e2.displayDetails();
    }
}
