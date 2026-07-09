public class CarConstructor {
    String brand;
    String model;
    int year;

    CarConstructor(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void startCar() {
        System.out.println(brand + " " + model + " is starting...");
    }

    void displayDetails() {
        System.out.println("Car Details");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        CarConstructor c1 = new CarConstructor("Hyundai", "i20", 2022);
        c1.displayDetails();
        c1.startCar();
    }
}
