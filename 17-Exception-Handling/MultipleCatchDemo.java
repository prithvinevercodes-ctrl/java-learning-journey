public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};

            int result = numbers[5] / 0; // may cause multiple errors
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: Invalid array index.");
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }

        System.out.println("Program finished after multiple catch handling.");
    }
}
