
public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));
        System.out.println("Sum of 5.5 and 10.5: " + calc.add(5.5, 10.5));
        System.out.println("Sum of 5, 10 and 15: " + calc.add(5, 10, 15));
        
        Animal myDog = new Animal();
        myDog.sound();
        cat myCat = new cat();
        myCat.sound();
        myCat.purr();
    }

}    
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
    void purr() {
        System.out.println("Cat purrs");
    }
}