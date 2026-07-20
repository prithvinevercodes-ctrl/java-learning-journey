import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {
    public static void main(String[] args) {
        try {
            // FileWriter is used to write text into a file
            FileWriter writer = new FileWriter("student_notes.txt");

            writer.write("Student Name: Sarthak");
");
            writer.write("Course: B.Tech CSE");
");
            writer.write("Topic: Java File Handling");
");

            writer.close();
            System.out.println("Text written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
