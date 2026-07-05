public class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("Break and Continue Demo");

        // We will loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Skip (continue) when i is 5
            if (i == 5) {
                System.out.println("Skipping 5 using continue");
                continue;   // goes to next iteration, does NOT print "i = 5"
            }

            // Stop (break) when i is 8
            if (i == 8) {
                System.out.println("Breaking at 8 using break");
                break;      // exits the loop completely
            }

            // This line prints only when we did not continue or break
            System.out.println("i = " + i);
        }

        System.out.println("Loop ended.");
    }
}
