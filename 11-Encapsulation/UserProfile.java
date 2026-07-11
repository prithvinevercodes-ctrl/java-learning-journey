public class UserProfile {
    // Private fields
    private String username;
    private String email;
    private int age;

    // Constructor
    public UserProfile(String username, String email, int age) {
        setUsername(username);
        setEmail(email);
        setAge(age);
    }

    public String getUsername() {
        return username;
    }

    // Validate username
    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        } else {
            System.out.println("Invalid username. Setting default username.");
            this.username = "guest";
        }
    }

    public String getEmail() {
        return email;
    }

    // Simple email validation
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Setting default email.");
            this.email = "default@example.com";
        }
    }

    public int getAge() {
        return age;
    }

    // Validate age
    public void setAge(int age) {
        if (age >= 13 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Setting age to 18.");
            this.age = 18;
        }
    }

    public void displayProfile() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        UserProfile u1 = new UserProfile("sarthak01", "sarthak@gmail.com", 19);
        UserProfile u2 = new UserProfile("", "wrongmail", 10);

        System.out.println("User 1:");
        u1.displayProfile();

        System.out.println("
User 2:");
        u2.displayProfile();
    }
}
