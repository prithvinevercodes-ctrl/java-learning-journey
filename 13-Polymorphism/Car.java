public class Car extends Vehicle {
    // Overriding parent method
    @Override
    void start() {
        System.out.println("Car starts with a key or push button.");
    }

    // Car-specific method
    void drive() {
        System.out.println("Car is being driven on the road.");
    }
}
