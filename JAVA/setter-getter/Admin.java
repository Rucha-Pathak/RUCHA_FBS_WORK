import java.util.Scanner;
class Admin {
    int id;
    String name;
    double salary;
    double allowance;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setAllowance(double a) {
        this.allowance = a;
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

    double getAllowance() {
        return this.allowance;
    }

    void display() {
        System.out.println("ID: " + this.id + ", Name: " + this.name + 
                           ", Salary: " + this.salary + ", Allowance: " + this.allowance);
    }
}

class Test {
    public static void main(String[] args) {
        Admin a1 = new Admin();
        a1.setId(201);
        a1.setName("Ravi");
        a1.setSalary(60000);
        a1.setAllowance(5000);
	a1.getId();
	a1.getName();
	a1.getSalary();
	a1.getAllowance();

        a1.display();
        
	Scanner sc = new Scanner(System.in);
	Admin a2 = new Admin();
 	
	System.out.println("Enter id: ");
	int i = sc.nextInt();
	sc.nextLine();

	System.out.println("Enter name: ");
	String n = sc.nextLine();

	System.out.println("Enter salary: ");
	double s = sc.nextDouble();

	System.out.println("Enter allowance: ");
	double a = sc.nextDouble();

	a2.setId(i);
        a2.setName(n);
        a2.setSalary(s);
        a2.setAllowance(a);
	a2.getId();
	a2.getName();
	a2.getSalary();
	a2.getAllowance();
	a2.display();
	
	


    }
}
