import java.util.ArrayList;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class StudentRepository {
    private ArrayList<Student> students = new ArrayList<>();

    // Save a student record
    public void save(Student student) {
        students.add(student);
    }

    // Find student by id
    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        StudentRepository repo = new StudentRepository();

        repo.save(new Student(1, "Sarthak"));
        repo.save(new Student(2, "Aman"));

        Student result = repo.findById(2);
        if (result != null) {
            System.out.println("Found student: " + result.getName());
        } else {
            System.out.println("Student not found.");
        }
    }
}
