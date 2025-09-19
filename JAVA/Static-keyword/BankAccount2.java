class BankAccount {
    int accNo;
    String holderName;
    double balance;
    static double interest_rate=10;

    
static{
 	double interest_rate=10;
 }

static void setInterestRate(double i,String n)
 	{

 	   interest_rate = i;//static variable
	  // name = n;this will give error nonstatic 
//variable in static function 
 	}

     BankAccount()
    {
         this.accNo=101;
         this.holderName ="Rucha";
         this.balance=45000;
	    }

	BankAccount(int a,String s,double b,double i)
    {
         this.accNo=a;
         this.holderName =s;
         this.balance=b;
	
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

    
    int getAccNo() {
        return this.accNo;
    }

    String getHolderName() {
        return this.holderName;
    }

    double getBalance() {
        return this.balance;
    }

    
    void display() {
        System.out.println("Account No: " + this.accNo + ", Holder: " + this.holderName +
                           ", Balance: " + this.balance + ", Interest rate: " + interest_rate);
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
        //b1.setInterestRate(9.3);
        b1.display();
	b1.setInterestRate();

	b2.setAccNo(102);
        b2.setHolderName("gopal");
        b2.setBalance(100000);
        //b2.setInterestRate(10);
        b2.display();

	b3.setAccNo(007);
        b3.setHolderName("vinu");
        b3.setBalance(1);
        //b3.setInterestRate(100000);
                
       
    }
}
