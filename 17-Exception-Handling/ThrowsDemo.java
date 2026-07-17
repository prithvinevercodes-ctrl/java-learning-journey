public class ThrowsDemo {

    // Method declaring exception using throws
    static void divideNumbers(int a, int b) throws ArithmeticException {
        int result = a / b;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            divideNumbers(20, 0);
        } catch (ArithmeticException e) {
            System.out.println("Handled using throws: " + e.getMessage());
        }
    }
}
