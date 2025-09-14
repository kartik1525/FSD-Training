public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); 
        myDog.bark();

        Cat myCat = new Cat();
        myCat.eat(); 
        myCat.meow(); 
    }
}
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); 
        myDog.bark(); 
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat(); 
        myCat.meow(); 
    }
}