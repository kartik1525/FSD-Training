
public class ExceptionThrow {
    
    public static void main(String[] args) {
        CheckAge obj = new CheckAge();
        try {
            obj.validate(16);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
class CheckAge {
    void validate(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be at least 18 to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}
