package demo;

import mypack.Student;

public class PackageExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Sarthak", "B.Tech CSE", "ABC University");
        s1.displayStudent();
    }
}
