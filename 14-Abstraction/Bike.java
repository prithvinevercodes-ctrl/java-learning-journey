public class Bike extends Vehicle {

    // Constructor
    Bike(String brand) {
        super(brand);
    }

    // Implementing abstract method
    @Override
    void start() {
        System.out.println(brand + " bike starts with a self-start or kick.");
    }

    // Implementing abstract method
    @Override
    void fuelType() {
        System.out.println(brand + " bike usually uses petrol.");
    }
}
