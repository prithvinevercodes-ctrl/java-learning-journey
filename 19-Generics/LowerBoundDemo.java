import java.util.ArrayList;
import java.util.List;

public class LowerBoundDemo {

    // Adds student IDs to a list that can accept Integer or its superclasses
    public static void addStudentIds(List<? super Integer> list) {
        list.add(101);
        list.add(102);
        list.add(103);
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addStudentIds(numbers);
        addStudentIds(objects);

        System.out.println("Numbers list: " + numbers);
        System.out.println("Objects list: " + objects);
    }
}
