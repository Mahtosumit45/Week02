package BankingSystemPackage;
import java.util.*;
// Main class to demonstrate functionality
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        // Adding account instances
        BankAccount savings = new SavingsAccount("SA123", "Alice", 10000.0);
        BankAccount current = new CurrentAccount("CA456", "Bob", 20000.0);

        accounts.add(savings);
        accounts.add(current);

        // Processing accounts
        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println("Interest Earned: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
                loanable.applyForLoan(3000.0); // Example loan application
            }

            System.out.println("---------------------------");
        }

        // Demonstrating deposit and withdrawal
        savings.deposit(5000);
        savings.withdraw(2000);
        savings.displayDetails();
    }
}
