public class Developer extends Employee {
    double monthlySalary;
    double bonus;

    // Constructor
    Developer(String name, int id, double monthlySalary, double bonus) {
        super(name, id);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    // Implementing abstract method
    @Override
    double calculateSalary() {
        return monthlySalary + bonus;
    }

    // Implementing abstract method
    @Override
    void workRole() {
        System.out.println(name + " works on coding, debugging, and software development.");
    }
}
