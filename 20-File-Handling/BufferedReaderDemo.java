import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("student_notes.txt"));

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error while using BufferedReader.");
            e.printStackTrace();
        }
    }
}
