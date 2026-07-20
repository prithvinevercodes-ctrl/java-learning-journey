import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Reading object from file
            StudentRecord student = (StudentRecord) in.readObject();

            System.out.println("Student ID: " + student.id);
            System.out.println("Student Name: " + student.name);
            System.out.println("Student Course: " + student.course);

            in.close();
            fileIn.close();
        } catch (IOException e) {
            System.out.println("Error during deserialization.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
            e.printStackTrace();
        }
    }
}
