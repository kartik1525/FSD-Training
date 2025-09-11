

public class InstancesDemo {
    int value=10;
    public static void main(String[] args) {
        InstancesDemo obj1=new InstancesDemo();
        InstancesDemo obj2=new InstancesDemo();
        System.out.println(obj1.value);
        System.out.println(obj2.value);
        obj1.value=20;
        System.out.println(obj1.value);
        System.out.println(obj2.value);
    }
}
