import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Queue for customer service tokens
        Queue<String> customers = new LinkedList<>();

        customers.add("Customer 1");
        customers.add("Customer 2");
        customers.add("Customer 3");

        System.out.println("Queue: " + customers);
        System.out.println("Serving: " + customers.poll()); // removes first element
        System.out.println("Updated Queue: " + customers);
    }
}
