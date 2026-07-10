class Person {
    void showRole() {
        System.out.println("This is a person.");
    }
}

class Teacher extends Person {
    @Override       //annotations 
    void showRole() {
        System.out.println("This person is a teacher.");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Person p = new Person();
        Teacher t = new Teacher();

        p.showRole();
        t.showRole();
    }
}
