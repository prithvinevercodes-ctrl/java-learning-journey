public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 27;
        int c = 19;

        System.out.println("Largest of Three Numbers");
        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
    }
}
