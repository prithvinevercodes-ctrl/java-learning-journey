import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet for sorted marks
        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(78);
        marks.add(92);
        marks.add(85);
        marks.add(78); // duplicate ignored

        System.out.println("Sorted Marks: " + marks);
    }
}
