public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345678", "John Doe", "Savings", 1234, 1000.0);
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Account Balance: ₹" + account.getBalance());
        System.out.println("Is Account Active? " + account.isAccountActive());
    }
}
class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;   
    private String accountType;     
    private boolean isActive;     
    private int pin;


    public BankAccount(String accountNumber, String accountHolderName, String accountType, int pin, double initialBalance) {
        if (accountNumber == null || accountNumber.length() < 8) {
            throw new IllegalArgumentException("Account number must be at least 8 characters");
        }
        if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        if (pin < 1000 || pin > 9999) {
            throw new IllegalArgumentException("PIN must be 4 digits");
        }

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.pin = pin;
        this.balance = 0.0;
        this.isActive = true;

        System.out.println("Bank Account created successfully!");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Initial Balance: ₹" + initialBalance);
        System.out.println("Account Status: Active\n");
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    public boolean isAccountActive() {
        return isActive;
    }
    public double getBalance() {
        return balance;
    }

}