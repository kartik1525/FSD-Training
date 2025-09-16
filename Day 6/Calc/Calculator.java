package Calc;

public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }
}
