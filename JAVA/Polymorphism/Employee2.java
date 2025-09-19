class Employee3 
{
     int id;
     String ename;
     double salary;
     
     
	 Employee3() 
	 {
		this.id=0;
		this.ename="not available";
		this.salary=0.0;
	 }


	 Employee3(int id, String ename, double salary) {
		
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	 }


	 int getId() {
		 return id;
	 }


	 void setId(int id) {
		 this.id = id;
	 }


	 String getEname() {
		 return ename;
	 }


	 void setEname(String ename) {
		 this.ename = ename;
	 }


	 double getSalary() {
		 return salary;
	 }


	 void setSalary(double salary) {
		 this.salary = salary;
	 }
	 
	 void display()
	 {
		 System.out.println("Id : " +this.id);
		 System.out.println("Name : "+this.ename);
		 System.out.println("salary : "+this.salary);
	 }
	 
	 double calSal()
	 {
		 return salary;
	 }
	
}//class Employee3 ends here

class Hr3 extends Employee3
{
       double commission;

	   Hr3() {
		super();
		this.commission = 0.0;
	   }

	   Hr3(int id, String ename, double salary,double commission) {
		super(id,ename,salary);
		this.commission = commission;
	   }

	   double getCommission() {
		   return commission;
	   }

	   void setCommission(double commission) {
		   this.commission = commission;
	   }
	   
	   void display()
	   {
		   super.display();
		   System.out.println("Commission : "+this.commission);
	   }
	   
	   double calSal()
	   {
		   return salary+commission;
	   }
	
}//class Hr3 ends here

class SalesManager3 extends Employee3
{
	 double incentive;
	 int target;
	 
		
		SalesManager3() 
		{
			super();
			this.incentive=0.0;
			this.target=0;
		}

		SalesManager3(int id, String eName, double salary,double incentive, int target) {
			super(id,eName,salary);
			this.incentive = incentive;
			this.target = target;
		}

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
		
		void display()
		{
			super.display();
			System.out.println("Incentive : "+this.incentive);
			System.out.println("Target : "+this.target );
		}
		double calSal()
		{
			return salary+incentive;
		}
	
}//class SalesManager3 ends here
class Admin3 extends Employee3
{
	double allowance;

	Admin3() {
		super();
		this.allowance=0.0;
	}

	Admin3(int id, String eName, double salary,double allowance) {
		super(id,eName,salary);
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display()
	{
		super.display();
		System.out.println("Allowance : "+this.allowance);
	}
	
	double calSal()
	{
		return salary+allowance;
	}
		
}//class Admin3 ends here

class TestEmployee3
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	   Employee3[] e = new Employee3[4];//array of references
	   
	   e[0] = new Employee3(1,"rucha",90000);
	   e[1] = new Hr3(2,"riya",80000,700);
	   e[2] = new SalesManager3(3,"john",70000,5000,100);
	   e[3] = new Admin3(4,"nisha",80000,500);
	   
	   for(int i=0;i<e.length;i++)
	   {
		   e[i].display();
		   System.out.println("Calculated salary : "+e[i].calSal());
		   System.out.println();
	   }
		

	}
}