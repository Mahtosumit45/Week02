public class BankAccount {

    // Static variable
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    // Final variable
    private final String accountNumber;

    // Instance variables
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;  // Increment the total account count when a new account is created
    }

    // Static method to get the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    // Getter for account number (to ensure it cannot be changed once assigned)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for bank name
    public static String getBankName() {
        return bankName;
    }

    public static void main(String[] args) {
        // Creating bank account objects
        BankAccount account1 = new BankAccount("Alice", "123456");
        BankAccount account2 = new BankAccount("Bob", "789101");

        // Displaying account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Displaying the total number of accounts
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
