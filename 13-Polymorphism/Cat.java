public class Cat extends Animal {
    // Overriding parent class method
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }

    // Cat-specific method
    void climb() {
        System.out.println("Cat is climbing the sofa.");
    }
}
