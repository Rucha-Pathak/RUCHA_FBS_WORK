import java.util.Scanner;

class Employee 
{
  int id;
  String name;
  double salary;
   
  void setId(int i)
  {
     this.id = i;
  }
  void setName(String str)
  {
     this.name = str;
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
    System.out.println("Id: "+this.id);
    System.out.println("Name: "+this.name);
    System.out.println("Salary: "+this.salary);
  }

}//class Employee ends here

class Test
{
   public static void main(String[] args)
   {
      Employee e1 = new Employee();
      e1.setId(101);
      e1.setName("Puja");
      e1.setSalary(75000);
    
      e1.getId();
	e1.getName();
	e1.getSalary();

      e1.display();
 
         Scanner sc = new Scanner(System.in);

	 Employee e2 = new Employee(); 
         System.out.println("Enter id of employee: ");
         int i = sc.nextInt();
	sc.nextLine();

	System.out.println("Enter name of employee: ");
	 String str= sc.nextLine();

	System.out.println("Enter salary of employee: ");
	double s = sc.nextDouble();
         

      e2.setId(i);
      e2.setName(str);
      e2.setSalary(s);
    
      e2.getId();
      e2.getName();
      e2.getSalary();

      e2.display();

   }
}//class Test ends here
   
  