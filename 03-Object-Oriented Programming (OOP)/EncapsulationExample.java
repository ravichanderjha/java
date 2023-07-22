class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accNumber, double initialBalance) {
        accountNumber = accNumber;
        balance = initialBalance;
    }

    // Getter method to access account balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("12345", 1000.0);

        // Using public methods to interact with the object
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(300.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
