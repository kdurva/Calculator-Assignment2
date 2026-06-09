public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition (int): " + calc.add(10, 20));
        System.out.println("Addition (double): " + calc.add(5.5, 2.5));
        System.out.println("Addition (3 numbers): " + calc.add(10, 20, 30));
        System.out.println("Subtraction: " + calc.subtract(20, 5));
        System.out.println("Multiplication: " + calc.multiply(4, 5));
        System.out.println("Division: " + calc.divide(20, 4));

        System.out.println("Stored Result: " + calc.getResult());
    }
}