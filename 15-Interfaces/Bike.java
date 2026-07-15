public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike starts with self-start or kick.");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops using hand brake.");
    }
}
