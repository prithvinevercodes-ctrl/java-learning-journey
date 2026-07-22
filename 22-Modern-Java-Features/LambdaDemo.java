public class LambdaDemo {
    public static void main(String[] args) {
        // Lambda expression for a simple greeting
        Runnable greet = () -> System.out.println("Hello from Lambda!");

        greet.run();

        // Lambda with parameters
        Addable add = (a, b) -> a + b;
        System.out.println("Sum: " + add.add(10, 20));
    }
}

// Functional interface
interface Addable {
    int add(int a, int b);
}
