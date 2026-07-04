public class NestedIfDemo {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        System.out.println("Nested If Demo");
        if (age >= 18) {
            if (hasID) {
                System.out.println("You are allowed to vote");
            } else {
                System.out.println("ID is required");
            }
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
