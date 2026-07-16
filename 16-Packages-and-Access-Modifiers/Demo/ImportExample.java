package demo;

import mypack.Calculator;
import mypack.Student;

public class ImportExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum: " + c.add(20, 30));

        Student s = new Student(102, "Somya", "Btech" , "XYZ College");
        s.displayStudent();
    }
}
