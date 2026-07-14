public class Car extends Vehicle {

    // Constructor
    Car(String brand) {
        super(brand);
    }

    // Implementing abstract method
    @Override
    void start() {
        System.out.println(brand + " car starts with a key or push button.");
    }

    // Implementing abstract method
    @Override
    void fuelType() {
        System.out.println(brand + " car uses petrol, diesel, or CNG.");
    }
}
