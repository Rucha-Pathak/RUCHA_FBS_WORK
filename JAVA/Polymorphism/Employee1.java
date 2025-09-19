class Employee
{
	int id;
	String eName;
	double salary;
	
	Employee()
	{
		this.id = 0;
		this.eName ="not available";
		this.salary = 0.0;
	}

	Employee(int id, String eName, double salary) 
	{
		super();
		this.id = id;
		this.eName = eName;
		this.salary = salary;
	}
	

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String geteName() {
		return eName;
	}

	void seteName(String eName) {
		this.eName = eName;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.eName);
		System.out.println("Salary : "+this.salary);
	}
	
}//class Employee ends here

class Hr extends Employee
{
	double commission;

	Hr() 
	{
		super();
		this.commission=0.0;
	}

	Hr(int id, String eName, double salary,double commission) {
		super(id,eName,salary);
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
		System.out.println("commission: "+this.commission);
	}
	
}//class hr ends here

class SalesManager  extends Employee
{
	double incentive;
	int target;
	
	SalesManager() 
	{
		super();
		this.incentive=0.0;
		this.target=0;
	}

	SalesManager(int id, String eName, double salary,double incentive, int target) {
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
}//class Salesmanager ends here

class Admin extends Employee
{
    double allowance;

	Admin() {
		super();
		this.allowance=0.0;
	}

	Admin(int id, String eName, double salary,double allowance) {
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
    	System.out.println("Allowance: "+this.allowance);
    }
	
}//class Admin ends here

class AreaSalesManager extends SalesManager
{
	String areaName;

	AreaSalesManager() {
		super();
		this.areaName="null";
	}

	AreaSalesManager(int id, String eName, double salary,double incentive, int target,String areaName) {
		super(id,eName,salary,incentive,target);
		this.areaName = areaName;
	}

	String getAreaName() {
		return areaName;
	}

	void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	void display()
	{
		super.display();
		System.out.println("Area name : "+this.areaName);
	}
	
}

class Polydemo {

	public static void main(String[] args) {
		Employee e1;
		
		e1 = new Employee(101,"sachin",78000);
		e1.display();
		
		e1 = new SalesManager(102,"rucha",90000,7800,50);//upcasting
		e1.display();
		
		e1 = new Admin(102,"john",40000,400);//upcasting
		e1.display();
		
		//same message -->display()
		//given to most generalized form = employee e1
		//for same behaviour =display
		//implimented differently = different output
		
	
	}

}


