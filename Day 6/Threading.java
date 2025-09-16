
public class Threading {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task("Task 1"));
        Thread thread2 = new Thread(new Task("Task 2"));
    
        thread1.start();
        thread2.start();
    }
    
}

class Task implements Runnable {
    private String name;
    
    public Task(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println(name + " is starting.");
        System.out.println(name + " completed.");
    }
}