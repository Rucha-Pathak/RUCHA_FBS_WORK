package View;

import Model.*;
import Controller.BankController;
import java.util.Scanner;

public class BankApp {
    private BankController controller = new BankController();
    private Scanner sc = new Scanner(System.in);
    
  

    public void start() {
        int choice;
        do {
            System.out.println("\n===== Welcome to ABC Bank =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account Details");
            System.out.println("5. View Transactions");
            System.out.println("6. Pay Loan EMI");
            System.out.println("7. Calculate Interest");
            System.out.println("8. Daily Final Report");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                	createAccount(); break;
                case 2: 
                	deposit(); break;
                case 3: 
                	withdraw(); break;
                case 4: 
                	displayAccountDetails(); break;
                case 5: 
                	viewTransactions(); break;
                case 6: 
                	payLoanEMI(); break;
                case 7: 
                	calculateInterest(); break;
                case 8: 
                	dailyFinalReport(); break;
                case 0: System.out.println("Thank you for banking with us!"); break;
                default: System.out.println("Invalid choice!");
            }
        } while(choice != 0);
    }

    
    private void createAccount() {
        System.out.println("Select Account Type: 1-Savings 2-Current 3-Salary 4-Loan");
        int type = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        switch(type) {
            case 1 -> {
                System.out.print("Enter initial balance: ");
                double bal = sc.nextDouble();
                controller.addAccount(new SavingsAccount(accNo, name, bal));
            }
            case 2 -> {
                System.out.print("Enter initial balance: ");
                double bal = sc.nextDouble();
                controller.addAccount(new CurrentAccount(accNo, name, bal));
            }
            case 3 -> {
                System.out.print("Enter initial balance: ");
                double bal = sc.nextDouble();
                controller.addAccount(new SalaryAccount(accNo, name, bal));
            }
            case 4 -> {
                System.out.print("Enter loan amount: ");
                double loan = sc.nextDouble();
                controller.addAccount(new LoanAccount(accNo, name, loan));
            }
            default -> System.out.println("Invalid type!");
        }
    }

    private void deposit() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        BankAccount acc = controller.findAccount(accNo);
        if(acc != null) {
            System.out.print("Enter amount to deposit: ");
            double amt = sc.nextDouble();
            acc.deposit(amt);
        }
    }

    private void withdraw() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        BankAccount acc = controller.findAccount(accNo);
        if(acc != null) {
            System.out.print("Enter amount to withdraw: ");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
        }
    }

    private void payLoanEMI() {
        System.out.print("Enter Loan Account Number: ");
        String accNo = sc.nextLine();
        BankAccount acc = controller.findAccount(accNo);
        if(acc instanceof LoanAccount loanAcc) {
            System.out.print("Enter EMI amount: ");
            double emi = sc.nextDouble();
            loanAcc.payEMI(emi);
        } else System.out.println("Not a loan account!");
    }

    private void displayAccountDetails() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        BankAccount acc = controller.findAccount(accNo);
        if(acc != null) acc.displayAccountDetails();
    }

    private void viewTransactions() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        BankAccount acc = controller.findAccount(accNo);
        if(acc != null) acc.displayTransactions();
    }

    public static void main(String[] args) {
        new BankApp().start();
    }
    
    private void calculateInterest() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        BankAccount acc = controller.findAccount(accNo);

        if (acc instanceof SavingsAccount savingsAcc) {
            double interest = savingsAcc.calculateInterest();
            System.out.println("Interest for Savings Account: ₹" + interest);
        } else if (acc instanceof LoanAccount loanAcc) {
            double interest = loanAcc.calculateInterest();
            System.out.println("Interest for Loan Account: ₹" + interest);
        } else {
            System.out.println("Interest calculation not applicable for this account type!");
        }
    }
    
    private void dailyFinalReport() 
    {
        System.out.println("\n===== Daily Final Report =====");
        for (BankAccount acc : controller.getAllAccounts())
        {
            acc.displayAccountDetails();
            System.out.println("----------------------------");
        }
    }
}
