class Employee2
{
	int id;
	String eName;
	double salary;
	
	Employee2()
	{
		this.id = 0;
		this.eName ="not available";
		this.salary = 0.0;
	}

	Employee2(int id, String eName, double salary) 
	{
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
	
	double calSal()
	{
		return salary;
	}
	
}//class Employee2 ends here

class Hr2 extends Employee2
{
	double commission;

	Hr2() 
	{
		super();
		this.commission=0.0;
	}

	Hr2(int id, String eName, double salary,double commission) {
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
		System.out.println("Commission: "+this.commission);
	}
	double calSal()
	{
		return salary+commission;
	}
	
}//class Hr2 ends here

class SalesManager2 extends Employee2
{
	double incentive;
	int target;
	
	SalesManager2() 
	{
		super();
		this.incentive=0.0;
		this.target=0;
	}

	SalesManager2(int id, String eName, double salary,double incentive, int target) {
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
}//class SalesManager2 ends here

class Admin2 extends Employee2
{
    double allowance;

	Admin2() {
		super();
		this.allowance=0.0;
	}

	Admin2(int id, String eName, double salary,double allowance) {
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
	double calSal()
	{
		return salary+allowance;
	}
}//class Admin2 ends here

class AreaSalesManager2 extends SalesManager2
{
	String areaName;

	AreaSalesManager2() {
		super();
		this.areaName="null";
	}

	AreaSalesManager2(int id, String eName, double salary,double incentive, int target,String areaName) {
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
	
}//class AreaSalesManager2 ends here

class Test3 {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2(1,"rucha",700000);
		
		System.out.println(e1.calSal());
		
		e1 = new Hr2(2,"riya",70000,2300);
		
		System.out.println(e1.calSal());
		
		e1 = new SalesManager2(3,"raha",67000,4500,100);
		e1.calSal();
		System.out.println(e1.calSal());
		
		e1= new Admin2(4,"radha",78000,2000);
		e1.calSal();
		System.out.println(e1.calSal());
		
//		AreaSalesManager2 a2 = new AreaSalesManager2(5,"riha",70000,5500,50,"pune");
//		a2.display();
	}
}
