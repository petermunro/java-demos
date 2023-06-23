public class CalculatorDriver {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("5 + 7 is: " + calc.add(5, 7));
        System.out.println("5 - 7 is: " + calc.subtract(5, 7));
        System.out.println("5 * 7 is: " + calc.multiply(5, 7));
        System.out.println("5 / 7 is: " + calc.divide(5, 7));

        System.out.println("5.3 + 7.6 is: " + calc.add(5.3, 7.6));
        System.out.println("5.3 - 7.6 is: " + calc.subtract(5.3, 7.6));
        System.out.println("5.3 * 7.6 is: " + calc.multiply(5.3, 7.6));
        System.out.println("5.3 / 7.6 is: " + calc.divide(5, 7.6));
    }
}
