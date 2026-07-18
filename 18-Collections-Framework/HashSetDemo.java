import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet for unique usernames
        HashSet<String> usernames = new HashSet<>();

        usernames.add("sarthak01");
        usernames.add("prithvi22");
        usernames.add("Somya10");
        usernames.add("sarthak01"); // duplicate ignored

        System.out.println("Unique Usernames: " + usernames);
    }
}
