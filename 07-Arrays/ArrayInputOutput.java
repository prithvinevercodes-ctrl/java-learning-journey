import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array Input Output Demo");

        int[] numbers = new int[5];

        // input
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // output
        System.out.println("You entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        sc.close();
    }
}
