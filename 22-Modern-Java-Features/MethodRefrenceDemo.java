public class MethodReferenceDemo {
    public static void main(String[] args) {
        // Method reference to a static method
        Printer printer = MethodReferenceDemo::showMessage;
        printer.print();

        // Method reference to an instance method
        MethodReferenceDemo demo = new MethodReferenceDemo();
        Printer printer2 = demo::display;
        printer2.print();
    }

    public static void showMessage() {
        System.out.println("This is a static method reference.");
    }

    public void display() {
        System.out.println("This is an instance method reference.");
    }
}

@FunctionalInterface
interface Printer {
    void print();
}
