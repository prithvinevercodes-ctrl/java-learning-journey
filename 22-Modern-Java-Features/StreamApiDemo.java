import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sarthak", "Aman", "Priya", "Riya", "Raj");

        // Print names starting with 'R'
        names.stream()
             .filter(name -> name.startsWith("R"))
             .forEach(System.out::println);

        System.out.println();

        // Convert names to uppercase
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
