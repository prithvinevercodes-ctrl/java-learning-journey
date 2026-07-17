public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            String name = null;

            // Trying to call method on null reference
            System.out.println("Length of name: " + name.length());
        } catch (NullPointerException e) {
            System.out.println("Error: String value is null.");
        }

        System.out.println("NullPointerException handled successfully.");
    }
}
