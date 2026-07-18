import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Natural sorting by marks
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name + " - " + marks;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Sarthak", 88));
        students.add(new Student(102, "Prithvi", 75));
        students.add(new Student(103, "Somya", 92));

        Collections.sort(students);

        System.out.println("Students sorted by marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
