public class DivisionByZeroDemo {
    public static void main(String[] args) {
        try {
            int a = 50;
            int b = 0;

            // This line will cause ArithmeticException
            int result = a / b;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("Program continues after handling exception.");
    }
}
