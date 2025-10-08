import java.util.*;

class Emp
{
   int id;
   String name;
   Double salary;

     void setid(int id) {
       this.id = id;
   }

   void setname(String name) {
       this.name = name;
   }

   void setsalary(double salary) {
       this.salary = salary;
   }

     int getid() {
       return this.id;
   }

   String getname() {
       return this.name;
   }

   double getsalary() {
       return this.salary;
   }

     void display() {
   	  System.out.println("ID is "+this.id);
 		System.out.println("Name is"+this.name);
 		System.out.println("Salary is "+this.salary);
		
   }
   
   Emp() {
       this.id = 101;
       this.name = "pallavi";
       this.salary = 30000.0;
       //System.out.println("default constructor");
   }

     Emp(int i, String n, double s) {
       this.id = i;
       this.name = n;
       this.salary = s;
      // System.out.println("parameterized constructor");
   }
     @Override
     public String toString() {
         return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
     }


}

class SalesManager1 extends Emp
{
	double incentive;
	int target;
	double getIncentive() {
		return incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	SalesManager1() {
		super();
		this.incentive=600;
		this.target=5;
		
	}
	SalesManager1(int i, String n, double s,double in,int t) {
		super(i, n, s);
		this.incentive=in;
		this.target=t;
		
	}
	
	void display()
	{
		super.display();
		System.out.println("Incentive is "+this.incentive);
		System.out.println("Target is"+this.target);
	}
	
	@Override
	public String toString() {
	    return super.toString() + ", Incentive: " + incentive + ", Target: " + target;
	}

}//Sales manager ends here

class HR extends Emp
{
	double commission;
	
	double getcommission() {
		return commission;
	}
	void setcommission(double  commission) {
		this.commission =  commission;
	}
	
	HR() {
		super();
		this.commission=600;	
	}
	HR(int i, String n, double s,double com) {
		super(i, n, s);
		this.commission=com;
	
		
	}
	
	void display()
	{
		super.display();
		System.out.println("Commission is "+this.commission);
		
	}
	@Override
	public String toString() {
	    return super.toString() + ", Commission: " + commission;
	}

}//HR ends here


class Admin extends Emp
{
	double allowance;
	
	double getallowance() {
		return allowance;
	}
	void setallowance(double  allowance) {
		this.allowance =  allowance;
	}
	
	Admin() {
		super();
		this.allowance=600;	
	}
	Admin(int i, String n, double s,double allo) {
		super(i, n, s);
		this.allowance=allo;
	
		
	}
	
	void display()
	{
		super.display();
		System.out.println("Allowance is "+this.allowance);
		
	}
	
	@Override
	public String toString() {
	    return super.toString() + ", Allowance: " + allowance;
	}

}//Admin ends here


public class TestA {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		
		a1.add(new SalesManager1(101,"sm1",6000,600,5));
		a1.add(new Admin(102,"A1",5000,500));
		a1.add(new HR(103,"HR1",7000,700));
		a1.add(new SalesManager1(104,"sm2",6500,700,10));
		a1.add(new Admin(105,"A2",5500,1500));
		a1.add(new HR(106,"HR2",75000,600));
		
		System.out.println(a1);

	}

}
