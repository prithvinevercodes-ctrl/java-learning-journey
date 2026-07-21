class BankAccount {
    private int balance = 5000;

    // synchronized prevents two threads from withdrawing at same time
    public synchronized void withdraw(String user, int amount) {
        System.out.println(user + " is trying to withdraw Rs." + amount);

        if (balance >= amount) {
            System.out.println(user + " withdrawal approved.");
            balance -= amount;
            System.out.println(user + " completed withdrawal. Remaining balance: Rs." + balance);
        } else {
            System.out.println(user + " withdrawal failed. Insufficient balance.");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread user1 = new Thread(() -> account.withdraw("Aman", 3000));
        Thread user2 = new Thread(() -> account.withdraw("Sarthak", 3000));

        user1.start();
        user2.start();
    }
}
