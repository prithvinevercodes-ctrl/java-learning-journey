class Student {
    int rollNo;
    String name;
    String course;
    double marks;

    Student(int rollNo, String name, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagementDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aman", "BCA", 85.5);
        Student s2 = new Student(102, "Priya", "BBA", 90.0);
        Student s3 = new Student(103, "Rahul", "B.Tech", 88.0);

        System.out.println("Student 1 Details");
        s1.displayDetails();

        System.out.println();

        System.out.println("Student 2 Details");
        s2.displayDetails();

        System.out.println();

        System.out.println("Student 3 Details");
        s3.displayDetails();
    }
          }
