// Creating a thread by extending Thread class
class MyThread extends Thread {

    @Override
    public void run() {
        // Code inside run() will be executed by the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread is running: " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        // start() creates a new thread and calls run()
        t1.start();

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread is running: " + i);
        }
    }
}
