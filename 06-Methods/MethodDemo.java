public class MethodDemo {

    // simple method with no parameters and no return value
    static void sayHello() {
        System.out.println("Hello from a method!");
    }

    public static void main(String[] args) {
        System.out.println("Method Demo");

        // calling the method
        sayHello();
        sayHello();   // we can call it again
    }
}
