public class TypeCastingDemo {
    public static void main(String[] args) {
        int num1 = 25;
        double result1 = num1;   // automatic casting // implict

        double num2 = 45.67;
        int result2 = (int) num2;   // manual casting // explicit

        System.out.println("Automatic Casting:");
        System.out.println("Int value: " + num1);
        System.out.println("Converted to double: " + result1);

        System.out.println();

        System.out.println("Manual Casting:");
        System.out.println("Double value: " + num2);
        System.out.println("Converted to int: " + result2);
    }
}
