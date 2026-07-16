import mypack.Calculator;
import mypack.Student;
import static mypack.MathOperations.square;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("10 + 20 = " + calc.add(10, 20));

        Student s = new Student(104, "Riya", "BCA", "National College");
        s.displayStudent();

        System.out.println("Square of 9 = " + square(9));
    }
}
