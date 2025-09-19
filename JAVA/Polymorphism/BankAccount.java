class BankAccount
{
	int accNumber;
	double balance;
	
	BankAccount() {
		this.accNumber = 0;
		this.balance = 0.0;
	}

	BankAccount(int accNumber, double balance) {
		
		this.accNumber = accNumber;
		this.balance = balance;
	}

	int getAccNumber() {
		return accNumber;
	}

	void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}
	
	void display()
	{
		System.out.println("Account number : "+this.accNumber);
		System.out.println("Balance : "+this.balance);
	}
	
	double calculateInterest()
	{
		return balance;
	}
	
	
	
}//class BankAccount ends here

class SavingAccount extends BankAccount
{
	double rate;

	SavingAccount() {
		super();
		this.rate =0;
	}

	SavingAccount(int accNumber, double balance,double rate) {
		super(accNumber,balance);
		this.rate = rate;
	}

	double getRate() {
		return rate;
	}

	void setRate(double rate) {
		this.rate = rate;
	}
	
	void display()
	{
		super.display();
		System.out.println("Rate of interest : "+this.rate);
	}
	double calculateInterest()
	{
		return ((this.balance)*(this.rate))/100;
	}
	
	
}//class SavingAccount ends here


class TestBankAccount
{
	public static void main(String [] args)
	{
		BankAccount b1;
		
		b1 = new BankAccount(101,78000);
		b1.display();
		System.out.println(b1.calculateInterest());
		System.out.println();
		
		b1 = new SavingAccount(102,56000,560);
		b1.display();
		System.out.println(b1.calculateInterest());
		System.out.println();
		
		
	     
		
	}
}