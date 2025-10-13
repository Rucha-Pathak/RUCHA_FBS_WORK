package Controller;

import Model.*;
import java.util.ArrayList;

public class BankController {
    private ArrayList<BankAccount> accounts;

    public BankController() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount acc) {
        accounts.add(acc);
        System.out.println("Account created successfully!");
    }

    public BankAccount findAccount(String accNo) {
        for(BankAccount acc : accounts) {
            if(acc.getAccountNumber().equals(accNo)) return acc;
        }
        System.out.println("Account not found!");
        return null;
    }

    public ArrayList<BankAccount> getAllAccounts() {
        return accounts;
    }
}
