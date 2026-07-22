import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Aman", 30000),
                new Employee(2, "Sarthak", 50000),
                new Employee(3, "Priya", 45000),
                new Employee(4, "Riya", 25000)
        );

        // Find employees with salary greater than 30000
        List<Employee> highSalary = employees.stream()
                .filter(emp -> emp.salary > 30000)
                .collect(Collectors.toList());

        System.out.println("Employees with salary > 30000:");
        for (Employee emp : highSalary) {
            System.out.println(emp);
        }
    }
}

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}
