public class CalculatorDriver {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            System.out.println("5 + 7 is: " + calc.add(5, 7));
            System.out.println("5 - 7 is: " + calc.subtract(5, 7));
            System.out.println("5 * 7 is: " + calc.multiply(5, 101));
            System.out.println("5 / 7 is: " + calc.divide(5, 7));
        } catch (CalculatorException ce) {
            System.err.println("Error: " + ce.getMessage());
            ce.printStackTrace();
        }

    }
}
