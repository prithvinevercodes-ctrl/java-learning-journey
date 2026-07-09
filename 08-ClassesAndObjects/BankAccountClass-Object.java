public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        b1.accountNumber = 12345;
        b1.accountHolderName = "Sarthak";
        b1.balance = 10000;

        b1.displayDetails();

        b1.deposit(2000);
        b1.withdraw(5000);
        b1.withdraw(10000);

        b1.displayDetails();
    }
}
