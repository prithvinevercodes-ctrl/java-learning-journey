public class Cat extends Animal {
    // Unique property for Cat
    String color;

    // Constructor
    Cat(String name, int age, String color) {
        super(name, age); // calling parent class constructor
        this.color = color;
    }

    // Cat-specific behavior
    void meow() {
        System.out.println(name + " is meowing.");
    }

    // Display cat details
    void displayCatDetails() {
        displayDetails(); // inherited method
        System.out.println("Color: " + color);
    }
}
