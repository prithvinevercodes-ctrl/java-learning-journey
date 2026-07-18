import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Rahul", 35000));
        employees.add(new Employee(2, "Aman", 28000));
        employees.add(new Employee(3, "Priya", 42000));

        // Sorting by name using Comparator
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });

        System.out.println("Employees sorted by name:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
