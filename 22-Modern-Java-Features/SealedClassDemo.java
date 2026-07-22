public class SealedClassDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}

sealed class Vehicle permits Car, Bike {
    public void start() {
        System.out.println("Vehicle is starting.");
    }
}

final class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
}

final class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }
}
