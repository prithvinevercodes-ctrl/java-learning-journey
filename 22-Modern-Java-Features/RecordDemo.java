public class RecordDemo {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord(101, "Sarthak", "B.Tech CSE");

        System.out.println("ID: " + student.id());
        System.out.println("Name: " + student.name());
        System.out.println("Course: " + student.course());
    }
}

// Record class
record StudentRecord(int id, String name, String course) {}
