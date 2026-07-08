public class MobileDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();

        m1.brand = "Samsung";
        m1.model = "Galaxy A15";
        m1.storage = 128;
        m1.price = 18999;

        m1.displayDetails();
        m1.makeCall();
    }
}
