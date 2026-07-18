import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Stack for browser tabs history
        Stack<String> pages = new Stack<>();

        pages.push("Home Page");
        pages.push("Products Page");
        pages.push("Checkout Page");

        System.out.println("Stack: " + pages);
        System.out.println("Top page: " + pages.peek());

        pages.pop(); // removes top element
        System.out.println("After pop: " + pages);
    }
}
