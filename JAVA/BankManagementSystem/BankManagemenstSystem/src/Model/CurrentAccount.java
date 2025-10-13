package Model;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit = 5000;

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount, balance));
            System.out.println("Withdrawn ₹" + amount + " successfully (Overdraft applied if needed).");
        } else System.out.println("Exceeds overdraft limit or invalid amount.");
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("\n--- Current Account ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }
}
