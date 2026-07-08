public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.brand = "Hyundai";
        c1.model = "i20";
        c1.year = 2022;
        c1.price = 850000;

        c1.displayDetails();
        c1.startCar();
    }
}
