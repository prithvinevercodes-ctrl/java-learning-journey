public class ThreadSleepDemo {
    public static void main(String[] args) {
        System.out.println("Countdown starts...");

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);

            try {
                // Pause for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }

        System.out.println("Countdown finished.");
    }
}
