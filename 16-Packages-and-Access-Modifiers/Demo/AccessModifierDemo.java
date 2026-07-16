package demo;

import mypack.Student;

public class AccessModifierDemo {
    public static void main(String[] args) {
        Student s1 = new Student(103, "Priya", "BBA", "City College");

        // Accessible because getter is public
        System.out.println("Roll No: " + s1.getRollNo());

        // Accessible because it is public
        System.out.println("College: " + s1.college);

        // Not accessible here because name has default access
        // System.out.println(s1.name);

        // Not accessible directly here because course is protected
        // System.out.println(s1.course);

        s1.displayStudent();
    }
}
