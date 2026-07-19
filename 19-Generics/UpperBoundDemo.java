import java.util.ArrayList;
import java.util.List;

public class UpperBoundDemo {

    // Accepts Number and subclasses like Integer, Double, Float
    public static double sumOfNumbers(List<? extends Number> list) {
        double sum = 0;

        for (Number num : list) {
            sum += num.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(80);
        marks.add(90);
        marks.add(85);

        List<Double> prices = new ArrayList<>();
        prices.add(10.5);
        prices.add(20.5);

        System.out.println("Sum of marks: " + sumOfNumbers(marks));
        System.out.println("Sum of prices: " + sumOfNumbers(prices));
    }
}
