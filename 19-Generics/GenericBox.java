// A simple generic box that can store any type of item
public class GenericBox<T> {
    private T item;

    // Set the item
    public void setItem(T item) {
        this.item = item;
    }

    // Get the item
    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        GenericBox<String> box1 = new GenericBox<>();
        box1.setItem("Java Book");
        System.out.println("Box 1 contains: " + box1.getItem());

        GenericBox<Integer> box2 = new GenericBox<>();
        box2.setItem(101);
        System.out.println("Box 2 contains: " + box2.getItem());
    }
}
