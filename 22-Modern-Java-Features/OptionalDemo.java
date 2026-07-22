import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String name = "Sarthak";

        Optional<String> optionalName = Optional.ofNullable(name);

        if (optionalName.isPresent()) {
            System.out.println("Name is present: " + optionalName.get());
        } else {
            System.out.println("Name is missing.");
        }

        // Safe default value
        String result = Optional.ofNullable(null).orElse("Default User");
        System.out.println("Result: " + result);
    }
}
