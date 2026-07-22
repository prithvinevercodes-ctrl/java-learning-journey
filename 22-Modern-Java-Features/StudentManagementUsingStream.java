import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StudentManagementUsingStreams {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(101, "Sarthak", 88),
                new Student(102, "Somya", 75),
                new Student(103, "Prithvi", 92),
                new Student(104, "Riya", 68)
        );

        // Print all students
        System.out.println("All Students:");
        students.forEach(System.out::println);

        System.out.println();

        // Students with marks greater than 80
        System.out.println("Students with marks > 80:");
        students.stream()
                .filter(s -> s.marks > 80)
                .forEach(System.out::println);

        System.out.println();

        // Sort by marks in descending order
        System.out.println("Students sorted by marks:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getMarks).reversed())
                .forEach(System.out::println);

        System.out.println();

        // Find top student
        Optional<Student> topper = students.stream()
                .max(Comparator.comparingInt(Student::getMarks));

        topper.ifPresent(student ->
                System.out.println("Top student: " + student)
        );
    }
}

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name + " - " + marks;
    }
          }
