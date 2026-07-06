public class FactorialUsingMethod {

    // method to calculate factorial of a number
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 5;

        System.out.println("Factorial Using Method");
        int result = factorial(number);

        System.out.println("Factorial of " + number + " is " + result);
    }
}
