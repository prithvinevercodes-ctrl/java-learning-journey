import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList to store student names
        ArrayList<String> students = new ArrayList<>();

        students.add("Sarthak");
        students.add("Ani");
        students.add("Somyaa");
        students.add("Sarthak"); // duplicates allowed

        System.out.println("Student List: " + students);
        System.out.println("First student: " + students.get(0));

        // Removing one student
        students.remove("Ani");

        System.out.println("Updated Student List: " + students);
    }
}
