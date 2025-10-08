import java.util.*;

class Employee
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
   
   Employee() {
       this.id = 101;
       this.name = "pallavi";
       this.salary = 30000.0;
       //System.out.println("default constructor");
   }

     Employee(int i, String n, double s) {
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

class SalesManager2 extends Employee
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
	SalesManager2() {
		super();
		this.incentive=600;
		this.target=5;
		
	}
	SalesManager2(int i, String n, double s,double in,int t) {
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

class HR2 extends Employee
{
	double commission;
	
	double getcommission() {
		return commission;
	}
	void setcommission(double  commission) {
		this.commission =  commission;
	}
	
	HR2() {
		super();
		this.commission=600;	
	}
	HR2(int i, String n, double s,double com) {
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


class Admin2 extends Employee
{
	double allowance;
	
	double getallowance() {
		return allowance;
	}
	void setallowance(double  allowance) {
		this.allowance =  allowance;
	}
	
	Admin2() {
		super();
		this.allowance=600;	
	}
	Admin2(int i, String n, double s,double allo) {
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


public class TestC {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeSet t1 = new TreeSet();
		
		t1.add(new SalesManager2(101,"sm1",6000,600,5));
		t1.add(new Admin2(102,"A1",5000,500));
		t1.add(new HR2(103,"HR1",7000,700));
		t1.add(new SalesManager2(104,"sm2",6500,700,10));
		t1.add(new Admin2(105,"A2",5500,1500));
		t1.add(new HR2(106,"HR2",75000,600));
		
		System.out.println(t1);

	}

}

//Output:-

//Exception in thread "main" java.lang.ClassCastException: class SalesManager2 cannot be 
//cast to class java.lang.Comparable (SalesManager2 is in unnamed module of loader 
//		'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//at java.base/java.util.TreeMap.compare(TreeMap.java:1604)
//at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:811)
//at java.base/java.util.TreeMap.put(TreeMap.java:820)
//at java.base/java.util.TreeMap.put(TreeMap.java:569)
//at java.base/java.util.TreeSet.add(TreeSet.java:259)
//at TestC.main(TestC.java:184)

