public class BankingSystemDemo {
    public static void main(String[] args) {
        double balance = 5000;
        double withdrawAmount = 7000;

        try {
            if (withdrawAmount > balance) {
                throw new ArithmeticException("Insufficient balance for withdrawal.");
            }

            balance = balance - withdrawAmount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);

        } catch (ArithmeticException e) {
            System.out.println("Banking Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the banking system.");
        }
    }
}
