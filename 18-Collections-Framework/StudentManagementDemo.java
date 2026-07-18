import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StudentManagementSystem {
    public static void main(String[] args) {

        // ArrayList to store student names
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Sarthak");
        studentNames.add("Prathvi");
        studentNames.add("Somya");
        studentNames.add("Riya");

        System.out.println("Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        // HashSet to store unique roll numbers
        HashSet<Integer> rollNumbers = new HashSet<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(101); // duplicate ignored

        System.out.println("
Unique Roll Numbers:");
        for (int roll : rollNumbers) {
            System.out.println(roll);
        }

        // HashMap to store roll number and marks
        HashMap<Integer, Integer> studentMarks = new HashMap<>();
        studentMarks.put(101, 85);
        studentMarks.put(102, 90);
        studentMarks.put(103, 78);

        System.out.println("
Student Marks:");
        for (int roll : studentMarks.keySet()) {
            System.out.println("Roll No: " + roll + ", Marks: " + studentMarks.get(roll));
        }

        // Search marks using roll number
        int searchRoll = 102;
        if (studentMarks.containsKey(searchRoll)) {
            System.out.println("
Marks of Roll No " + searchRoll + ": " + studentMarks.get(searchRoll));
        } else {
            System.out.println("Roll number not found.");
        }
    }
}
