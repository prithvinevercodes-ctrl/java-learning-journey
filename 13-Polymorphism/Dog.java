public class Dog extends Animal {
    // Overriding parent class method
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }

    // Dog-specific method
    void fetch() {
        System.out.println("Dog is fetching the ball.");
    }
}
