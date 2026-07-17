public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int num = 100 / 0; // exception
            System.out.println("Result: " + num);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program ended.");
    }
}
