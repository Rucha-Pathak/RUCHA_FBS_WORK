class BankAccount {
    int accNo;
    String holderName;
    double balance;
    static double interest_rate;

     BankAccount()
    {
         this.accNo=101;
         this.holderName ="Rucha";
         this.balance=45000;
	this.interest_rate=400;
    }

	BankAccount(int a,String s,double b,double i)
    {
         this.accNo=a;
         this.holderName =s;
         this.balance=b;
	this.interest_rate=i;
    }


    void setAccNo(int acc) {
        this.accNo = acc;
    }

    void setHolderName(String h) {
        this.holderName = h;
    }

    void setBalance(double b) {
        this.balance = b;
    }

    void setInterestRate(double i) {
        this.interest_rate = i;
    }

    int getAccNo() {
        return this.accNo;
    }

    String getHolderName() {
        return this.holderName;
    }

    double getBalance() {
        return this.balance;
    }

    double getInterestRate() {
        return this.interest_rate;
    }

    void display() {
        System.out.println("Account No: " + this.accNo + ", Holder: " + this.holderName +
                           ", Balance: " + this.balance + ", Interest rate: " + this.interest_rate);
    }
}

class Test {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
	BankAccount b2 = new BankAccount();
	BankAccount b3 = new BankAccount();
        b1.setAccNo(101);
        b1.setHolderName("nishi");
        b1.setBalance(50000);
        b1.setInterestRate(9.3);
        b1.display();

	b2.setAccNo(102);
        b2.setHolderName("gopal");
        b2.setBalance(100000);
        b2.setInterestRate(10);
        b2.display();

	b3.setAccNo(007);
        b3.setHolderName("vinu");
        b3.setBalance(1);
        b3.setInterestRate(100000);
        b3.display();

	b1.display();
	b2.display();
	
	b3.display();
        
       
    }
}
