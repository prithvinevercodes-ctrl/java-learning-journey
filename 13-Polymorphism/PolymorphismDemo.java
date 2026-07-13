public class PolymorphismDemo {
    public static void main(String[] args) {
        // Parent reference, child object
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        System.out.println("Animal Example:");
        a1.makeSound();  // Dog version runs
        a2.makeSound();  // Cat version runs

        System.out.println();

        Vehicle v1 = new Car();
        System.out.println("Vehicle Example:");
        v1.start();      // Car version runs

        System.out.println();

        Payment p1 = new UPIPayment();
        Payment p2 = new CardPayment();

        System.out.println("Payment Example:");
        p1.pay(500);
        p2.pay(1200);
    }
}
