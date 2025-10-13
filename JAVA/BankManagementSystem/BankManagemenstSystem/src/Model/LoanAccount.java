package Model;

import java.util.ArrayList;

public class LoanAccount extends BankAccount {
    private double loanAmount;
    private double interestRate = 10.5;

    public LoanAccount(String accNo, String name, double loanAmount) {
        super(accNo, name, 0);
        this.loanAmount = loanAmount;
    }

    public void payEMI(double amount) {
        if(amount > 0 && loanAmount >= amount) {
            loanAmount -= amount;
            transactions.add(new Transaction("EMI Payment", amount, loanAmount));
            System.out.println("EMI of ₹" + amount + " paid successfully.");
        } else System.out.println("Invalid EMI amount.");
    }

    // Calculate interest for this loan only
    public double calculateInterest() {
        return loanAmount * interestRate / 100;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("\n--- Loan Account ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Remaining Loan Amount: ₹" + loanAmount);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
