public class ThrowDemo {

    static void checkAge(int age) {
        if (age < 18) {
            // Throwing exception manually
            throw new ArithmeticException("Access denied - Age must be 18 or above.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
