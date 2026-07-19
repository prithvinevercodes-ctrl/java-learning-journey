// Generic pair class to store two related values
public class GenericPair<T, U> {
    private T first;
    private U second;

    public GenericPair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        GenericPair<Integer, String> student = new GenericPair<>(101, "Sarthak");
        System.out.println("Roll No: " + student.getFirst());
        System.out.println("Name: " + student.getSecond());
    }
}
