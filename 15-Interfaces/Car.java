public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with a push button.");
    }

    @Override
    public void stop() {
        System.out.println("Car stops using the brake pedal.");
    }
}
