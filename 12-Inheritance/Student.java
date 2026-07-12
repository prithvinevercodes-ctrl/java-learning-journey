public class Student extends Person {
    // Student-specific properties
    int rollNo;
    String course;

    // Constructor
    Student(String name, int age, int rollNo, String course) {
        super(name, age); // calling parent constructor
        this.rollNo = rollNo;
        this.course = course;
    }

    // Student-specific method
    void study() {
        System.out.println(name + " is studying " + course + ".");
    }

    void displayStudentDetails() {
        displayPersonDetails(); // inherited method
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
