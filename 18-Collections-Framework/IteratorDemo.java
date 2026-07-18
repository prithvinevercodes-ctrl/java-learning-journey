import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");

        Iterator<String> it = courses.iterator();

        System.out.println("Courses using Iterator:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
