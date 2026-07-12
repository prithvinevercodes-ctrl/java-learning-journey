public class Dog extends Animal {
    // Unique property for Dog
    String breed;

    // Constructor of child class
    Dog(String name, int age, String breed) {
        super(name, age); // calling parent class constructor
        this.breed = breed;
    }

    // Dog-specific behavior
    void bark() {
        System.out.println(name + " is barking.");
    }

    // Display dog details
    void displayDogDetails() {
        displayDetails(); // inherited method from Animal
        System.out.println("Breed: " + breed);
    }
}
