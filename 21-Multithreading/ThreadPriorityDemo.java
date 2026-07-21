class PriorityTask extends Thread {
    public PriorityTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        PriorityTask t1 = new PriorityTask("Low Priority Thread");
        PriorityTask t2 = new PriorityTask("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
    }
}
