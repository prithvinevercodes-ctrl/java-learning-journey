import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

    // Unbounded wildcard - can print any type of list
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    // Upper bound - good for reading numbers
    public static double totalMarks(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) {
            total += n.doubleValue();
        }
        return total;
    }

    // Lower bound - good for adding integers
    public static void addDemoItems(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sarthak");
        names.add("Aman");

        List<Integer> marks = new ArrayList<>();
        marks.add(90);
        marks.add(85);

        List<Number> numbers = new ArrayList<>();

        System.out.println("Printing names:");
        printList(names);

        System.out.println("Total marks: " + totalMarks(marks));

        addDemoItems(numbers);
        System.out.println("Numbers after adding: " + numbers);
    }
}
