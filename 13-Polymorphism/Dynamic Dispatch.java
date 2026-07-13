public class DynamicDispatchDemo {
    public static void main(String[] args) {
        // Parent class reference
        Animal animal;

        // Reference points to Dog object
        animal = new Dog();
        animal.makeSound();

        // Reference now points to Cat object
        animal = new Cat();
        animal.makeSound();

        System.out.println();

        // Payment example with same parent reference
        Payment payment;

        payment = new UPIPayment();
        payment.pay(750);

        payment = new CardPayment();
        payment.pay(1500);
    }
}
