public class Calculator {

    private double result;

    public Calculator() {
        result = 0;
    }

    public double getResult() {
        return result;
    }

    // Addition for integers
    public double add(int a, int b) {
        result = a + b;
        return result;
    }

    // Addition for decimal numbers
    public double add(double a, double b) {
        result = a + b;
        return result;
    }

    // Addition of 3 integers
    public double add(int a, int b, int c) {
        result = a + b + c;
        return result;
    }

    // Subtraction
    public double subtract(int a, int b) {
        result = a - b;
        return result;
    }

    public double subtract(double a, double b) {
        result = a - b;
        return result;
    }

    // Multiplication
    public double multiply(int a, int b) {
        result = a * b;
        return result;
    }

    public double multiply(double a, double b) {
        result = a * b;
        return result;
    }

    // Division
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        result = (double) a / b;
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        result = a / b;
        return result;
    }
}