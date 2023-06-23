public class Calculator {
    final static int UPPER_LIMIT = 100;
    final static int LOWER_LIMIT = -100;
    private static boolean isInRange(int a, int b) {
        return a >= LOWER_LIMIT && a <= UPPER_LIMIT && b >= LOWER_LIMIT && b <= UPPER_LIMIT;
    }
    public int add(int a, int b) throws CalculatorException {
        if (!isInRange(a, b)) {
            throw new CalculatorException("Parameter out of range");
        }
        return a + b;
    }
    public int subtract(int a, int b) throws CalculatorException {
        if (!isInRange(a, b)) {
            throw new CalculatorException("Parameter out of range");
        }
        return a - b;
    }

    public int multiply(int a, int b) throws CalculatorException {
        if (!isInRange(a, b)) {
            throw new CalculatorException("Parameter out of range");
        }
        return a * b;
    }

    public int divide(int a, int b) throws CalculatorException {
        if (!isInRange(a, b)) {
            throw new CalculatorException("Parameter out of range");
        }
        return a / b;
    }



}
