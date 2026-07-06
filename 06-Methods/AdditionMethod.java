public class AdditionMethod {

    // method to add two integers and return the sum
    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Addition Method Demo");

        int result1 = add(5, 10);
        int result2 = add(20, 30);

        System.out.println("Sum of 5 and 10 = " + result1);
        System.out.println("Sum of 20 and 30 = " + result2);
    }
}
