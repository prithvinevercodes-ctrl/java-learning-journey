package demo;

import static mypack.MathOperations.square;
import static mypack.MathOperations.cube;

public class StaticImportDemo {
    public static void main(String[] args) {
        System.out.println("Square of 5: " + square(5));
        System.out.println("Cube of 3: " + cube(3));
    }
}
