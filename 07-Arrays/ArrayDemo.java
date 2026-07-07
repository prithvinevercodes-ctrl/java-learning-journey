public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Array Demo");

        // declare and create an array of 5 integers
        int[] numbers = new int[5];

        // assign values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // print values
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " = " + numbers[i]);
        }
    }
}
