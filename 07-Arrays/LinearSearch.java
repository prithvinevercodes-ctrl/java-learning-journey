public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 60};
        int key = 30;
        boolean found = false;

        System.out.println("Linear Search");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                found = true;
                System.out.println("Element " + key + " found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}
