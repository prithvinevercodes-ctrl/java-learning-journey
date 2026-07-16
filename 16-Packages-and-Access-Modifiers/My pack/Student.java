package mypack;

public class Student {
    // Private variable - accessible only inside this class
    private int rollNo;

    // Default variable - accessible only inside same package
    String name;

    // Protected variable - same package + subclasses in other packages
    protected String course;

    // Public variable - accessible from anywhere
    public String college;

    // Constructor
    public Student(int rollNo, String name, String course, String college) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.college = college;
    }

    // Public getter for private data
    public int getRollNo() {
        return rollNo;
    }

    // Public method
    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("College: " + college);
    }
}
