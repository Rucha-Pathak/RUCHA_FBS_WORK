package Model;

public class SavingsAccount extends BankAccount {
    private double interestRate = 3.5;

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        double interestRate = 3.5; // 3.5% annual
        return getBalance() * interestRate / 100;
    }
    
    @Override
    public void displayAccountDetails() {
        System.out.println("\n--- Savings Account ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
