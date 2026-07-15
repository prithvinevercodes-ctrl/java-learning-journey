public class InterfaceDemo {
    public static void main(String[] args) {
        // Interface reference can hold object of implementing class
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        System.out.println("Vehicle Interface Example:");
        v1.start();
        v1.stop();

        System.out.println();

        v2.start();
        v2.stop();
    }
}
