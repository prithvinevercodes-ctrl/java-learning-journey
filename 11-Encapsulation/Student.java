public class Student {
    // Private data members - data hiding
    private int rollNo;
    private String name;
    private double marks;

    // Constructor
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        setName(name);     // using setter for validation
        setMarks(marks);   // using setter for validation
    }

    // Getter for roll number
    public int getRollNo() {
        return rollNo;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid student name. Setting default name.");
            this.name = "Unknown";
        }
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }

    // Setter for marks with validation
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Setting marks to 0.");
            this.marks = 0;
        }
    }

    // Display method
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aman", 85);
        Student s2 = new Student(102, "", 120);

        System.out.println("Student 1 Details:");
        s1.displayDetails();

        System.out.println("
Student 2 Details:");
        s2.displayDetails();
    }
}
