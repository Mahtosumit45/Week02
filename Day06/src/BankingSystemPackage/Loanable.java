package BankingSystemPackage;

// Interface Loanable
interface Loanable {
    boolean applyForLoan(double amount);

    double calculateLoanEligibility();
}
