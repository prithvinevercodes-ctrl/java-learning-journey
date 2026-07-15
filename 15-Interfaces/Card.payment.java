public class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Debit/Credit Card.");
    }
}
