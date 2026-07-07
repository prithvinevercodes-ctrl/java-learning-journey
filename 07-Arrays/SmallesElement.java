public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23};

        System.out.println("Smallest Element in Array");

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Smallest element = " + min);
    }
}
