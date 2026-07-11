public class Person {
    // Private data members
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    // Validate name
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Setting default name.");
            this.name = "Unknown";
        }
    }

    public int getAge() {
        return age;
    }

    // Validate age
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Setting age to 0.");
            this.age = 0;
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Priya", 20);
        Person p2 = new Person("", 150);

        System.out.println("Person 1:");
        p1.displayDetails();

        System.out.println("
Person 2:");
        p2.displayDetails();
    }
}
