public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();

        Vehicle v = new Car();
        v.start();
    }
}
