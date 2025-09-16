import Calc.Calculator;

public class PackagesDemo {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Addition of 5 and 10: " + calc.add(5, 10));
        System.out.println("Multiplication of 5.5 and 10.5: " + calc.multiply(5.5, 10.5));
        System.out.println("Subtraction of 20, 5 and 3: " + calc.subtract(20, 5, 3));
        System.out.println("Division of 100 by 4: " + calc.divide(100, 4));
    }
}
