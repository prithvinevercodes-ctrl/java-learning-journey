public class GenericMethodDemo {

    // Generic method to print any type of value
    public static <T> void printValue(T value) {
        System.out.println("Value: " + value);
    }

    // Generic method to swap array elements
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        printValue("Hello Java");
        printValue(123);
        printValue(45.67);

        String[] names = {"Lappu", "Priya", "Riya"};
        swap(names, 0, 2);

        System.out.println("After swap:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
