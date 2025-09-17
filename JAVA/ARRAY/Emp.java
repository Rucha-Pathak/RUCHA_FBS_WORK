class Emp
{
    int id;
    String name;
    double salary;

	Emp ()
	{
	  this.id = 0;
	  this.name = null;
	  this.salary = 0.0;
        }

	Emp(int i,String s,double d)
	{
	  this.id = i;
	  this.name = s;
	  this.salary = d; 
 	}

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    void display() {
        System.out.println("ID: " + this.id + ", Name: " + this.name + ", Salary: " + this.salary);
    }
}
 


class Test
{
   public static void main(String[] args)
  {
	int i;
	Emp[] brr = new Emp[5];
	//array of references
	//which has null at all the array locations 
	
	//for( i=0;i<brr.length;i++)
	//{
	  //System.out.println(brr[i]);
	//}//prints null 5 times

	
	//for( i=0;i<brr.length;i++)
	//{
	  //brr[i].display();

	//}//this gives nullPointerException

	brr[0] = new Emp();//default
	brr[1] = new Emp(2,"riya",34000);//parameterized
	brr[2] = new Emp(3,"raha",74000);
	brr[3] = new Emp(4,"rua",55000);
	brr[4] = new Emp(5,"rishi",73000);

	for( i=0;i<brr.length;i++)
	{
	  brr[i].display();
	}
       
  }
}
       