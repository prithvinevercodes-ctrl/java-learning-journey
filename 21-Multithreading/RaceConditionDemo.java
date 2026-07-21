class SharedValue {
    int value = 0;

    public void increment() {
        value++;
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedValue shared = new SharedValue();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                shared.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                shared.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Expected value should be 20000, but may be less due to race condition
        System.out.println("Final Value: " + shared.value);
    }
}
