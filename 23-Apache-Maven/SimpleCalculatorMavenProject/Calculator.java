package com.example;

// Simple calculator class
public class Calculator {

    // Add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divide two numbers
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
}
