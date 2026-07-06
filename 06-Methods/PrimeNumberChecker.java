public class PrimeNumberChecker {

    // method to check if a number is prime
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;  // not prime
            }
        }

        return true;  // prime
    }

    public static void main(String[] args) {
        int num = 17;

        System.out.println("Prime Number Checker Using Method");

        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
