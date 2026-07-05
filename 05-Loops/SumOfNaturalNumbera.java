public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        System.out.println("Sum of Natural Numbers from 1 to " + n);

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}
