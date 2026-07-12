public class Animal {
    // Common properties of all animals
    String name;
    int age;

    // Constructor of parent class
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Common method for all animals
    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
