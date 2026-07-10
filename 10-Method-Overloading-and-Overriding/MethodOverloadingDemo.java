public class MethodOverloadingDemo {

    void sendMessage(String name) {
        System.out.println("Hello, " + name);
    }

    void sendMessage(String name, String course) {
        System.out.println("Hello, " + name + ". Welcome to " + course);
    }

    void sendMessage(String name, String course, int fee) {
        System.out.println("Hello, " + name + ". Course: " + course + ", Fee: " + fee);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        obj.sendMessage("Prithvi");
        obj.sendMessage("Prithvi", "Java");
        obj.sendMessage("Prithvi", "Java", 5000);
    }
}
