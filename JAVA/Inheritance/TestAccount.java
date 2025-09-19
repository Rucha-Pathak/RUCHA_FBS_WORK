
class BankAccount 
{
    String accountHolder;
    double balance;

    BankAccount() {
        this.accountHolder = "Defautlt";
        this.balance = 0;
        System.out.println("BankAccount Default Constructor");
    }

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        System.out.println("BankAccount Parameterized Constructor");
    }
    
    
    String getAccountHolder() {
		return accountHolder;
	}

	void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	void display() {
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.balance);
    }
}// class BankAccount ends here

class SavingsAccount extends BankAccount
{
    double interestRate;

    SavingsAccount() {
        super();
        this.interestRate = 4.5;
        System.out.println("SavingsAccount Default Constructor");
    }

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
        System.out.println("SavingsAccount Parameterized Constructor");
    }
    
    // setters and getters
    double getInterestRate() {
		return interestRate;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	void display() {
		System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.balance);
        System.out.println("Interest Rate: " + this.interestRate + "%");
    }
}// class SavingsAccount ends here

class TestAccount
{
    public static void main(String[] args) {
    	
    	System.out.println();
        BankAccount b1 = new BankAccount();
        b1.display();

    	System.out.println();
        BankAccount b2 = new BankAccount("Pallavi", 5000);
        b2.display();

    	System.out.println();
        SavingsAccount s1 = new SavingsAccount();
        s1.display();

    	System.out.println();
        SavingsAccount s2 = new SavingsAccount("Priyanka", 10000, 6.0);
        s2.display();
    }
}// class TestBankAccount ends here
