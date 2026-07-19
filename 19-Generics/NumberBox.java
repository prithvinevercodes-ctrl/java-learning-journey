// A box that stores only Number types
public class NumberBox<T extends Number> {
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    // Return value as double for easy calculation
    public double getDoubleValue() {
        return number.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setNumber(25);
        System.out.println("Integer value: " + intBox.getNumber());
        System.out.println("As double: " + intBox.getDoubleValue());

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setNumber(99.5);
        System.out.println("Double value: " + doubleBox.getNumber());
    }
}
