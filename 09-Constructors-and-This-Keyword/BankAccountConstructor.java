public class BankAccountConstructor {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccountConstructor(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccountConstructor b1 = new BankAccountConstructor(12345, "Sarthak", 10000);
        b1.displayDetails();
        b1.deposit(2000);
        b1.withdraw(3000);
        b1.displayDetails();
    }
}
