package Model;
import java.util.ArrayList;


public abstract class BankAccount 
{
	 String accountNumber;
     String accountHolderName;
     double balance;
     ArrayList<Transaction> transactions;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount, balance));
            System.out.println("Deposited ₹" + amount + " successfully.");
        } else System.out.println("Invalid deposit amount.");
    }

    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount, balance));
            System.out.println("Withdrawn ₹" + amount + " successfully.");
        } else System.out.println("Insufficient balance or invalid amount.");
    }

    public void displayTransactions() {
        if(transactions.isEmpty()) System.out.println("No transactions yet.");
        else {
            System.out.println("\nTransaction History:");
            for(Transaction t : transactions) System.out.println(t);
        }
    }

    public abstract void displayAccountDetails();
}
