package Model;

public class SalaryAccount extends BankAccount {

    public SalaryAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("\n--- Salary Account ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }

    // SalaryAccount does not earn interest, so this method is optional
    public double calculateInterest() {
        return 0;
    }
}
