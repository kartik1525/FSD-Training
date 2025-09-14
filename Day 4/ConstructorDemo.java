public class ConstructorDemo {
    
    int x;
    String name;

    public ConstructorDemo() {
        this.x = 0;
        this.name = "Kartik";
    }

 
    public ConstructorDemo(int x, String name) {
        this.x = x;
        this.name = name;
    }

    public void display() {
        System.out.println("Value of x: " + x);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorDemo obj1 = new ConstructorDemo();
        obj1.display();
        ConstructorDemo obj2 = new ConstructorDemo(10, "Hello");
        obj2.display();
    }
}
