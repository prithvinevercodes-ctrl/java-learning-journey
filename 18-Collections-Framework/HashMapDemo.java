import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Roll number -> Student name
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Sarthak");
        students.put(102, "Prithvi");
        students.put(103, "Somya");

        System.out.println("Student Map: " + students);
        System.out.println("Student with roll 102: " + students.get(102));
    }
}
