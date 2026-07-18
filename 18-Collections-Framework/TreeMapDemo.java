import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Employee ID -> Employee name
        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(3, "Rahul");
        employees.put(1, "Neha");
        employees.put(2, "Amit");

        System.out.println("Sorted Employee Map: " + employees);
    }
}
