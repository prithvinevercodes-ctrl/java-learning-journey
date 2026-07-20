import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentDataManager {

    // Add a student record to the file
    public static void addStudent(String id, String name, String course) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt", true));

            bw.write(id + ", " + name + ", " + course);
            bw.newLine();

            bw.close();
            System.out.println("Student record added successfully.");
        } catch (IOException e) {
            System.out.println("Error while adding student record.");
            e.printStackTrace();
        }
    }

    // Read all student records from the file
    public static void readStudents() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));

            String line;
            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error while reading student records.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        addStudent("101", "Sarthak", "B.Tech CSE");
        addStudent("102", "Prithvi", "B.Tech IT");
        addStudent("103", "Somya", "B.Sc CS");

        System.out.println();
        readStudents();
    }
}
