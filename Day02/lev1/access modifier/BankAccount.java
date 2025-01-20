// Main class for demonstration
public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);
        System.out.println("Initial Balance: $" + account.getBalance());

        // Perform deposit and withdrawal
        account.deposit(200.0);
        account.withdraw(150.0);
        account.withdraw(1200.0); // Attempt to withdraw more than balance

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Alice Smith", 5000.0, 3.5);

        // Display SavingsAccount details
        savingsAccount.displayAccountDetails();
    }
}
class BankAccount {
    // Attributes with different access modifiers
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". Remaining balance: $" + balance);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Interest rate for the savings account

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance); // Call the superclass constructor
        this.interestRate = interestRate;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessing public attribute
        System.out.println("Account Holder: " + accountHolder); // Accessing protected attribute
        System.out.println("Balance: $" + getBalance());        // Accessing private attribute via getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


