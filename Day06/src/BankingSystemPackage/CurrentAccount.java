package BankingSystemPackage;

// Subclass CurrentAccount
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01; // 1% annual interest
    private static final double LOAN_ELIGIBILITY_RATE = 0.2; // 20% of balance

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public boolean applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) {
            System.out.println("Loan approved for amount: " + amount);
            return true;
        } else {
            System.out.println("Loan amount exceeds eligibility.");
            return false;
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LOAN_ELIGIBILITY_RATE;
    }
}