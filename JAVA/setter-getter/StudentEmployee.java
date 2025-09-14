class Student
{
   int rollno;
   String name;
   double percentage;
   
//constructor
   Student()
   {
     this.rollno = 5;
     this.name = "john";
     this.percentage = 90.00;
   }
   Student(int r, String str, double p)
   {
     this.rollno = r;
     this.name =str;
     this.percentage = p;
   }
   
   //setters
   void setRollno(int r)
   {
       this.rollno = r;
   }
   void setName(String str)
   {
       this.name = str;
   }
   void setPercentage(double p)
   {
       this.percentage = p;
   }

  //getters
   int getRollno()
   {
       return this.rollno;
   }
   String getName()
   {
       return this.name;
   }
   double getPercentage()
   {
       return this.percentage;
   }

   //display
   void display()
   {
        System.out.println("rollno: "+this.rollno);
         System.out.println("name: "+this.name);
	 System.out.println("percentage: "+this.percentage);
   }
}//class Student ends here

class Employee
{
   int id;
   String name;
   double salary;

   //constructor
   Employee()
   {
     this.id = 5;
     this.name = "john";
     this.salary = 90000.00;
   }
   Employee(int i, String str, double s)
   {
     this.id = i;
     this.name = str;
     this.salary = s;
   }

   //setters
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

   //getters
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

   //display
   void display()
   {
        System.out.println("ID: "+this.id);
         System.out.println("name: "+this.name);
	 System.out.println("salary: "+this.salary);
   }
}//class Employee ends here


class Bank {
    // Overloaded method for Student loan approval
    void approveLoan(Student s) {
        System.out.println("\nLoan Approval for Student: " + s.name);
        if (s.percentage > 80) {
            System.out.println("Approved Loan: 2,00,000");
        } else if (s.percentage >= 60 && s.percentage <= 80) {
            System.out.println("Approved Loan: 1,00,000");
        } else if (s.percentage >= 40 && s.percentage < 60) {
            System.out.println("Approved Loan: 50,000");
        } else {
            System.out.println("No Loan Approved");
        }
    }

    // Overloaded method for Employee loan approval
    void approveLoan(Employee e) {
        System.out.println("\nLoan Approval for Employee: " + e.name);
        if (e.salary > 12) {
            System.out.println("Approved Loan: 7,00,000");
        } else if (e.salary >= 10 && e.salary <= 12) {
            System.out.println("Approved Loan: 6,00,000");
        } else {
            System.out.println("No Loan Approved");
        }
    }
}
    

class Test 
{
  public static void main(String[] args)
  {
        Student s1 = new Student(101, "Rohan", 85.5);
        Student s2 = new Student(102, "Meena", 55.0);

        Employee e1 = new Employee(201, "Amit", 13.2);
        Employee e2 = new Employee(202, "Rucha", 9.5);   

	Bank b1 = new Bank();
 	
	b1.approveLoan(s1);
	s1.display();
        b1.approveLoan(s2);
        s2.display();
        b1.approveLoan(e1);
	e1.display();
        b1.approveLoan(e2);
	e2.display();
  }
}

  


