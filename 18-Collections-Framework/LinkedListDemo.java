import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // LinkedList for storing tasks
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Complete Java assignment");
        tasks.add("Submit lab report");
        tasks.addFirst("Wake up early");
        tasks.addLast("Sleep on time");

        System.out.println("Task List: " + tasks);

        tasks.removeFirst();
        System.out.println("After removing first task: " + tasks);
    }
}
