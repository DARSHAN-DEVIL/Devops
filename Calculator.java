public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

public static void main(String[] args) {
    Calculator calc = new Calculator();

    // Addition tests
    System.out.println("Add: " + calc.add(3, 5));      // 8
    System.out.println("Add: " + calc.add(-2, 4));     // 2

    // Subtraction tests
    System.out.println("Subtract: " + calc.subtract(10, 4));  // 6
    System.out.println("Subtract: " + calc.subtract(3, 5));   // -2

    // Multiplication tests
    System.out.println("Multiply: " + calc.multiply(6, 7));   // 42
    System.out.println("Multiply: " + calc.multiply(-3, 5));  // -15

    // Division tests
    System.out.println("Divide: " + calc.divide(20, 5));      // 4
    try {
        System.out.println("Divide: " + calc.divide(10, 0));  // Exception
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}