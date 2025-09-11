

public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Original value of a: " + a);
        
        int unaryPlus = +a;
        System.out.println("Unary plus (+a): " + unaryPlus);
        
        int unaryMinus = -a;
        System.out.println("Unary minus (-a): " + unaryMinus);
        
        int increment = ++a;
        System.out.println("Pre-increment (++a): " + increment);
        
        increment = a++; 
        System.out.println("Post-increment (a++): " + increment);
        System.out.println("Value of a after post-increment: " + a);
        
    
        int decrement = --a; 
        System.out.println("Pre-decrement (--a): " + decrement);
        
        decrement = a--; 
        System.out.println("Post-decrement (a--): " + decrement);
        System.out.println("Value of a after post-decrement: " + a);
        
        boolean flag = true;
        System.out.println("Original boolean value: " + flag);
        boolean notFlag = !flag;
        System.out.println("Logical NOT (!flag): " + notFlag);
    }
    
}
