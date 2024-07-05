package lms;

public class BankAccount {
    private double balance;
    
    public BankAccount() {
        this.balance = 0.0;
    }
    
    // Deposit a fixed amount of money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
    }
    
    // Deposit a variable amount of money with a description
    public void deposit(double amount, String description) {
        balance += amount;
        System.out.println("Deposited " + amount + " (" + description + ")");
    }
    
    // Deposit money from another account
    public void deposit(BankAccount fromAccount, double amount) {
        fromAccount.balance -= amount;
        balance += amount;
        System.out.println("Transferred " + amount + " from account " + fromAccount.hashCode());
    }
    
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        // Example usage
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        
        account1.deposit(100);
        account2.deposit(50, "Salary");
        
        System.out.println("Balance of account1: " + account1.getBalance());
        System.out.println("Balance of account2: " + account2.getBalance());
        
        account2.deposit(account1, 50);
        
        System.out.println("Balance of account2 after transfer: " + account2.getBalance());
    }
}

