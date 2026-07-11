public class PasswordManager {
    // Private field
    private String password;

    // Constructor
    public PasswordManager(String password) {
        setPassword(password);
    }

    // Setter with validation
    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Password must be at least 6 characters long.");
            this.password = "default123";
        }
    }

    // Verify password
    public boolean verifyPassword(String input) {
        return password.equals(input);
    }

    // Display only status, not actual password
    public void displayPasswordStatus() {
        System.out.println("Password is stored securely.");
    }

    public static void main(String[] args) {
        PasswordManager p1 = new PasswordManager("java123");
        PasswordManager p2 = new PasswordManager("123");

        p1.displayPasswordStatus();
        System.out.println("Password check for p1: " + p1.verifyPassword("java123"));

        p2.displayPasswordStatus();
        System.out.println("Password check for p2: " + p2.verifyPassword("default123"));
    }
}
