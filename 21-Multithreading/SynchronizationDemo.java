class SafeCounter {
    int count = 0;

    // synchronized method allows only one thread at a time
    public synchronized void increment() {
        count++;
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        SafeCounter counter = new SafeCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Safe Counter Value: " + counter.count);
    }
}
