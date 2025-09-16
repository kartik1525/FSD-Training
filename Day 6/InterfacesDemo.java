
public class InterfacesDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.sleep();

        Cat myCat = new Cat();
        myCat.eat();
        myCat.sleep();
    }
}

interface Animal {
    void eat();
    void sleep();
}
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating.");
    }
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}
class Cat implements Animal {
    public void eat() {
        System.out.println("Cat is eating.");
    }
    public void sleep() {
        System.out.println("Cat is sleeping.");
    }
}