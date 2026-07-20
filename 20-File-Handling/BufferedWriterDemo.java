import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt"));

            bw.write("Weekly Report");
            bw.newLine();
            bw.write("1. Java file handling completed.");
            bw.newLine();
            bw.write("2. Practice programs written.");
            bw.newLine();
            bw.write("3. Concepts understood clearly.");

            bw.close();
            System.out.println("Data written using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Error while using BufferedWriter.");
            e.printStackTrace();
        }
    }
}
