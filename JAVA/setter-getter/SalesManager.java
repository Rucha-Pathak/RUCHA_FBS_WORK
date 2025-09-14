import java.util.Scanner;

class SalesManager
{
    int id;
    String name;
    double salary;

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
}//class SalesManager ends here

class Test {
    public static void main(String[] args) { 

        Scanner sc = new Scanner (System.in);

        SalesManager s1 = new SalesManager();
        s1.setId(1);
        s1.setName("Amit");
        s1.setSalary(50000);
        s1.display();
        

	SalesManager s2 = new SalesManager();

	System.out.println("enter the id :");
 	int i = sc.nextInt();

	s2.setId(i);
	sc.nextLine();

	System.out.println("enter the name :");
 	String n = sc.nextLine();

        s2.setName(n);

	System.out.println("enter the salary :");
 	double s = sc.nextDouble();

        s2.setSalary(s);
        s2.display();
 	
        
    }
}//class Test ends here
