public class Vehicle {
    // Common vehicle properties
    String brand;
    int year;

    // Constructor
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Common method
    void start() {
        System.out.println(brand + " vehicle is starting.");
    }

    void displayVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
