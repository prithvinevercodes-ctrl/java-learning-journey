public class BankAccount {
    // Private data members
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for account holder name
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.trim().isEmpty()) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Invalid account holder name. Setting default name.");
            this.accountHolderName = "Unknown";
        }
    }

    public double getBalance() {
        return balance;
    }

    // Private setter so balance cannot be directly modified from outside
    private void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Opening balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(12345, "Sarthak", 10000);
        BankAccount b2 = new BankAccount(54321, "", -5000);

        System.out.println("Bank Account 1:");
        b1.displayDetails();
        b1.deposit(2000);
        b1.withdraw(3000);
        b1.displayDetails();

        System.out.println("
Bank Account 2:");
        b2.displayDetails();
    }
}
