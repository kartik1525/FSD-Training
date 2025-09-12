public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 12; 
        int b = 10;  

        System.out.println("a & b: " + (a & b));  
        System.out.println("a | b: " + (a | b));   
        System.out.println("a ^ b: " + (a ^ b));   
        System.out.println("~a: " + (~a));         
        System.out.println("b << 1: " + (a << 2)); 
        System.out.println("b >> 1: " + (a >> 2)); 
    }
}