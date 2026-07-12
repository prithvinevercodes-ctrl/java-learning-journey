public class Car extends Vehicle {
    // Unique property for Car
    String model;

    // Constructor
    Car(String brand, int year, String model) {
        super(brand, year); // parent constructor call
        this.model = model;
    }

    // Car-specific behavior
    void drive() {
        System.out.println(brand + " " + model + " is being driven.");
    }

    void displayCarDetails() {
        displayVehicleDetails(); // inherited method
        System.out.println("Model: " + model);
    }
}
