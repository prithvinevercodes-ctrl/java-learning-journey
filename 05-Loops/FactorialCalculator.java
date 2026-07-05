public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;

        System.out.println("Factorial Calculator");
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
