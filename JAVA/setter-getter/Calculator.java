class Calculator {

    // Add
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    // Subtract
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double subtract(int a, double b) {
        return a - b;
    }

    double subtract(double a, int b) {
        return a - b;
    }

    // Multiply
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double multiply(int a, double b) {
        return a * b;
    }

    double multiply(double a, int b) {
        return a * b;
    }

    // Divide
    int divide(int a, int b) {
        return a / b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    double divide(int a, double b) {
        return a / b;
    }

    double divide(double a, int b) {
        return a / b;
    }
}

class Test {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Addition: " + calc.add(5.5, 2.2));
        System.out.println("Addition: " + calc.add(5, 2.5));
        System.out.println("Addition: " + calc.add(3.5, 2));

        System.out.println("Subtraction: " + calc.subtract(10, 4));
        System.out.println("Multiplication: " + calc.multiply(6, 2.5));
        System.out.println("Division: " + calc.divide(20.0, 5));
    }
}
