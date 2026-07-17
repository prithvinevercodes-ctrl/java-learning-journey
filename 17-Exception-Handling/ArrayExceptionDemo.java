public class ArrayExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] marks = {85, 90, 78, 92};

            // Invalid index access
            System.out.println("Marks: " + marks[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of range.");
        }

        System.out.println("Array program ended safely.");
    }
}
