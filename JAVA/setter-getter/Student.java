import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;

    void setRollNo(int r) {
        this.rollNo = r;
    }

    void setName(String n) {
        this.name = n;
    }

    void setMarks(double m) {
        this.marks = m;
    }

    int getRollNo() {
        return this.rollNo;
    }

    String getName() {
        return this.name;
    }

    double getMarks() {
        return this.marks;
    }

    void display() {
        System.out.println("Roll No: " + this.rollNo + ", Name: " + this.name + ", Marks: " + this.marks);
    }
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(101);
        s1.setName("Rucha");
        s1.setMarks(92.5);
        s1.display();

        Scanner sc = new Scanner(System.in);

	Student s2 = new Student();

	System.out.println("Enter roll no: ");
	int r = sc.nextInt();
	sc.nextLine();

	System.out.println("Enter name: ");
	String n = sc.nextLine();

	System.out.println("Enter marks: ");
	double m = sc.nextDouble();
	
	s2.setRollNo(r);
        s2.setName(n);
        s2.setMarks(m);
	s2.getRollNo();
	s2.getRollNo();
        s2.display();



    }
}
