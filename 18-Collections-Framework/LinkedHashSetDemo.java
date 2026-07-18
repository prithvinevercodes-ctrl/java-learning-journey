import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Stores visited pages in order without duplicates
        LinkedHashSet<String> visitedPages = new LinkedHashSet<>();

        visitedPages.add("Home");
        visitedPages.add("About");
        visitedPages.add("Contact");
        visitedPages.add("Home"); // duplicate ignored

        System.out.println("Visited Pages: " + visitedPages);
    }
}
