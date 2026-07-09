public class Mobile {
    String brand;
    String model;
    int storage;
    double price;

    void makeCall() {
        System.out.println("Calling from " + brand + " " + model + "...");
    }

    void displayDetails() {
        System.out.println("Mobile Details");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Price: " + price);
    }
}
