// Creating a thread using Runnable interface
class DownloadTask implements Runnable {

    @Override
    public void run() {
        // Simulating file download
        for (int i = 1; i <= 5; i++) {
            System.out.println("Downloading file... " + (i * 20) + "%");
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        DownloadTask task = new DownloadTask();

        // Pass Runnable object to Thread
        Thread t1 = new Thread(task);
        t1.start();

        System.out.println("Main thread: Download started...");
    }
}
