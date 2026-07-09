public class Car {
    String brand;
    String model;
    int year;
    double price;

    void startCar() {
        System.out.println(brand + " " + model + " is starting...");
    }

    void displayDetails() {
        System.out.println("Car Details");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}
