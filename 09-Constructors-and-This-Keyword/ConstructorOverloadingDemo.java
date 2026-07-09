public class ConstructorOverloadingDemo {
    String name;
    int age;

    ConstructorOverloadingDemo() {
        name = "Unknown";
        age = 0;
    }

    ConstructorOverloadingDemo(String name) {
        this.name = name;
        this.age = 0;
    }

    ConstructorOverloadingDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloadingDemo p1 = new ConstructorOverloadingDemo();
        ConstructorOverloadingDemo p2 = new ConstructorOverloadingDemo("Aman");
        ConstructorOverloadingDemo p3 = new ConstructorOverloadingDemo("Rahul", 20);

        p1.display();
        System.out.println();

        p2.display();
        System.out.println();

        p3.display();
    }
}
