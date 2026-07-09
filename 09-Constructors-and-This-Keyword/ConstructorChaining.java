public class ConstructorChainingDemo {
    String name;
    int age;
    String city;

    ConstructorChainingDemo() {
        this("Unknown", 0, "Not Given");
    }

    ConstructorChainingDemo(String name, int age) {
        this(name, age, "Not Given");
    }

    ConstructorChainingDemo(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        ConstructorChainingDemo p1 = new ConstructorChainingDemo();
        ConstructorChainingDemo p2 = new ConstructorChainingDemo("Prithvi", 19);
        ConstructorChainingDemo p3 = new ConstructorChainingDemo("Somya", 20, "Delhi");

        p1.display();
        System.out.println();

        p2.display();
        System.out.println();

        p3.display();
    }
}
