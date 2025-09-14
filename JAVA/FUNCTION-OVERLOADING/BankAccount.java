class BankAccount {
    int accNo;
    String holderName;
    double balance;
    double interest_rate;

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

    String getInterestRate() {
        return this.interest_rate;
    }

    void display() {
        System.out.println("Account No: " + this.accNo + ", Holder: " + this.holderName +
                           ", Balance: " + this.balance + ", Branch: " + this.branch);
    }
}

class Test {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAccNo(123456);
        ba.setHolderName("Rucha Pathak");
        ba.setBalance(50000);
        ba.setBranch("Pune");
        ba.display();
        System.out.println("Acc No: " + ba.getAccNo());
        System.out.println("Holder: " + ba.getHolderName());
        System.out.println("Balance: " + ba.getBalance());
        System.out.println("Branch: " + ba.getBranch());
    }
}
