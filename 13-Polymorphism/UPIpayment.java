public class UPIPayment extends Payment {
    // Overriding pay method
    @Override
    void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI.");
    }
}
