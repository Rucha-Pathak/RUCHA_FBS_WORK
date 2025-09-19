class Employee
{ 

   int id;
   String name;
   double salary;
 
   Employee()
  {
     this.id = 0;
	this.name = "not available";
	this.salary = 0.0;
  }

  Employee(int i,String n,double s)
 {
   this.id = i;
   this.name = n;
   this.salary = s;
}

  void setId(int i)
 {
    this.id = i;
 }
void setName(String n)
 {
   this.name = n;
}
 void setSalary(double s)
 {
    this.salary = s;
}

    int getId()
  {
 	return this.id;
  }
  String getName()
 {
   return this.name;
 }
double getSalary()
 {
 
    return this.salary;  
}

void display()
 {  
   System.out.println("Id : "+this.id);
   System.out.println("name : "+this.name);
   System.out.println("salary :"+this.salary);

 }
}//class Employee ends here


class SalesManager extends Employee
{
   
    double incentive ;
    int target;

    SalesManager()
   {
      super();
      this.incentive =0.0;
    this.target = 0;
 }
   SalesManager(int i,String n,double s,double ic,int t)
  {
    super(i,n,s);
    this.incentive=ic;
   this.target=t;
  }

   void setIncentive(double ic)
  {
	this.incentive=ic;
   }
void setTarget(int t)
 {
       this.target=t;
 }

double getIncentive()
{
   return this.incentive;
}
int getTarget()
{
    return this.target;
 }
void display()
{
 super.display();
 System.out.println("incentive  :"+this.incentive);  
 System.out.println("target : "+this.target);
}

}//class SalesManager ends here

class AreaSalesManager  extends SalesManager
{
   String areaName;
   
    AreaSalesManager()
   {

 	super();
        this.areaName="not available";
   }
  AreaSalesManager(int i,String n,double s,double ic,int t,String a)
  {
   super(i,n,s,ic,t);
        this.areaName=a;
 }
 
  void setAreaName(String a)
  {
	this.areaName=a;
   }
   String getAreaName()
{
   return this.areaName;
}

  void display()
 {
     super.display();
     System.out.println("area Name: "+this.areaName);
  }

}//class AreaSalesManager ends here

class Test
{  
   public static void main(String[] args)
  { 
	Employee e1= new Employee(1,"rucha",90000);
	e1.display();
	System.out.println();
	SalesManager s1= new SalesManager(2,"ria",75000,6700,100);
	s1.display();
	System.out.println();
	AreaSalesManager a1 = new AreaSalesManager(3,"sam",56000,700,50,"Nagpur");
 	a1.display();
  }

}