class ReportThread extends Thread {
    @Override
    public void run() {
        System.out.println("Generating report...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Report generation interrupted.");
        }
        System.out.println("Report generated successfully.");
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) {
        ReportThread t1 = new ReportThread();
        t1.start();

        try {
            // Main thread waits for t1 to finish
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Now sending report to manager.");
    }
}
