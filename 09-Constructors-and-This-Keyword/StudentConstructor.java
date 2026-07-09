public class StudentConstructor {
    int rollNo;
    String name;
    String course;

    StudentConstructor(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Student Details");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        StudentConstructor s1 = new StudentConstructor(101, "Aman", "BCA");
        s1.displayDetails();
    }
}
