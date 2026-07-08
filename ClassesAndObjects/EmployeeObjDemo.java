public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.empId = 201;
        e1.name = "Rahul";
        e1.basicSalary = 25000;
        e1.bonus = 5000;

        e1.displayDetails();
    }
}
