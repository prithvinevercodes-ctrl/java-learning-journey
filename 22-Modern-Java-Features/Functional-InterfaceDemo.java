public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Using lambda with a functional interface
        Greeting greeting = name -> System.out.println("Good morning, " + name);

        greeting.sayHello("Sarthak");
    }
}

// Functional interface
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}
