public class CardPayment extends Payment {
    // Overriding pay method
    @Override
    void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Debit/Credit Card.");
    }
}
