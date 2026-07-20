import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    String name;
    String course;

    StudentRecord(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord(101, "Sarthak", "B.Tech CSE");

        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Writing object into file
            out.writeObject(student);

            out.close();
            fileOut.close();

            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error during serialization.");
            e.printStackTrace();
        }
    }
}
