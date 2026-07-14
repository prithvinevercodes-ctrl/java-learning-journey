public abstract class Vehicle {
    String brand;

    // Constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Normal method
    void showBrand() {
        System.out.println("Vehicle brand: " + brand);
    }

    // Abstract methods
    abstract void start();
    abstract void fuelType();
}
