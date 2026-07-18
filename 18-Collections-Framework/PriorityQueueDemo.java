import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Smaller number = higher priority here
        PriorityQueue<Integer> priorities = new PriorityQueue<>();

        priorities.add(3);
        priorities.add(1);
        priorities.add(5);
        priorities.add(2);

        System.out.println("Priority Queue: " + priorities);
        System.out.println("Highest priority item: " + priorities.poll());
        System.out.println("After poll: " + priorities);
    }
}
