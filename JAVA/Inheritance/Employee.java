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
  Employee(int i,String n ,double s)
  {
     this.id =i;
	this.name = n;
	this.salary=s;
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
   	this.salary= s;
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
	System.out.println("Name : "+this.name);
	System.out.println("salary : "+this.salary);
}
}//class Employee ends here

class SalesManager extends Employee
{
    double commission;
    
    SalesManager()
   {
     super();
	this.commission = 0.0;
   }

    SalesManager(int i,String n ,double s,double co)
   {
     super(i,n,s);
	this.commission = co;
   }
   
   void setCommission(double co)
  {
     this.commission = co;
  }
  double getCommission()
  {
   return this.commission;
  }
  void display()
 {
   super.display();
   System.out.println("commission: "+this.commission);
}
}//class Salesmanager ends here

class AreaSalesManager extends SalesManager
{
   String areaName;
   
   AreaSalesManager()
  {
    super();
    this.areaName="not available";

}
  AreaSalesManager(int i,String n ,double s,double co,String a)
{ 
    super(i,n,s,co);
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
   System.out.println("area name: "+this.areaName);
 }
}//class AreaSalesManager ends here

class Test
{
   public static void main(String [] args)
   {
       Employee e1 = new Employee(1,"rucha",57000);
	e1.display();
   	System.out.println();

	SalesManager s1 = new SalesManager(2,"john",67000,500);
	s1.display();
	System.out.println();

	AreaSalesManager a1  = new AreaSalesManager(3,"sam",55000,7000,"Pune");
 	a1.display();
	System.out.println();
   }
}